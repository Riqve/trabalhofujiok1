package br.com.fujideia.iesp.tecback.repository;

import br.com.fujideia.iesp.tecback.model.Esporte;
import br.com.fujideia.iesp.tecback.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EsporteRepository extends JpaRepository<Esporte,Integer> {


}
