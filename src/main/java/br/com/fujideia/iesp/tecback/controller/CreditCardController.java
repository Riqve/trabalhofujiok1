package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.CreditCard;
import br.com.fujideia.iesp.tecback.service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/creditcard")
public class CreditCardController {

    @Autowired
    private CreditCardService service;

    @PostMapping
    public ResponseEntity<CreditCard> salvar(@RequestBody CreditCard creditCard){
        creditCard = service.salvar(creditCard);
        return ResponseEntity.ok(creditCard);
    }
    @GetMapping
    public ResponseEntity<List<CreditCard>> listar(){
        return ResponseEntity.ok(service.listar());
    }
    @GetMapping("/{id} ")
    public ResponseEntity<CreditCard> consultarPorCPF(@PathVariable String id){
        return ResponseEntity.ok(service.consultarPorCPF(id));
}
}