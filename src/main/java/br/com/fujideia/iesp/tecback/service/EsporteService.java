package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Esporte;
import br.com.fujideia.iesp.tecback.repository.EsporteRepository;
import jakarta.ws.rs.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Slf4j
@Service
public class EsporteService {

    @Autowired
    private EsporteRepository repository;

    public Esporte salvar(Esporte esporte){
        esporte = repository.save(esporte);
        return esporte;
    }

    public Esporte alterar(Esporte esporte){
        if(Objects.nonNull(esporte.getId())){
            esporte = repository.save(esporte);
        }else{
            throw new NotFoundException();
        }
        return esporte;
    }

    public List<Esporte> listar(){
        return repository.findAll();
    }

    public Boolean excluir(Integer id){
        try {
            repository.deleteById(id);
        }catch (Exception e ){
            log.info("Erro ao realizar Exclusão : {}", e);
            return false;

        }
        return true;
    }



    public Esporte consultarPorId(Integer id){
        return repository
                .findById(id)
                .orElseThrow(NotFoundException::new);
    }


}
