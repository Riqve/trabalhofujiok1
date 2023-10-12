package br.com.fujideia.iesp.tecback.repository;


import br.com.fujideia.iesp.tecback.model.PagPix;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagPixRepository extends JpaRepository<PagPix,String> {

}
