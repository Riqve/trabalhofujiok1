package br.com.fujideia.iesp.tecback.controller;


import br.com.fujideia.iesp.tecback.model.Esporte;
import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.service.EsporteService;
import br.com.fujideia.iesp.tecback.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/esporte")
public class EsporteController {

    @Autowired
    private EsporteService service;

    @PostMapping
    public ResponseEntity<Esporte> salvar(@RequestBody Esporte esporte){
        esporte = service.salvar(esporte);
        return ResponseEntity.ok(esporte);
    }

    @PutMapping
    public ResponseEntity<Esporte> alterar(@RequestBody Esporte esporte){
        esporte = service.alterar(esporte);
        return ResponseEntity.ok(esporte);
    }

    @GetMapping
    public ResponseEntity<List<Esporte>> listar(){
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Esporte> consultar(@PathVariable("id") Integer id){
        return ResponseEntity.ok(service.consultarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> excluir(@PathVariable("id") Integer id){
        if(service.excluir(id)){
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }

}
