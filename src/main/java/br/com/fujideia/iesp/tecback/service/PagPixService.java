package br.com.fujideia.iesp.tecback.service;


import br.com.fujideia.iesp.tecback.model.PagPix;
import br.com.fujideia.iesp.tecback.repository.PagPixRepository;
import jakarta.ws.rs.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class PagPixService {
    @Autowired
    private PagPixRepository repository;

    public PagPix salvar(PagPix PagPix){
        PagPix = repository.save(PagPix);
        return PagPix;
    }


    public List<PagPix> listar(){
        return repository.findAll();
    }


    public PagPix consultarPorId(String id){
        return repository
                .findById(id)
                .orElseThrow(NotFoundException::new);
    }

}
