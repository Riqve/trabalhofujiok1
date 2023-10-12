package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.model.PagPix;
import br.com.fujideia.iesp.tecback.service.FilmeService;
import br.com.fujideia.iesp.tecback.service.PagPixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pagpix")
public class PagPixController {

    @Autowired
    private PagPixService service;

    @PostMapping
    public ResponseEntity<PagPix> salvar(@RequestBody PagPix PagPix){
        PagPix = service.salvar(PagPix);
        return ResponseEntity.ok(PagPix);
    }

    @GetMapping
    public ResponseEntity<List<PagPix>> listar(){
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PagPix> consultar(@PathVariable("id") String id){
        return ResponseEntity.ok(service.consultarPorId(id));
    }
}
