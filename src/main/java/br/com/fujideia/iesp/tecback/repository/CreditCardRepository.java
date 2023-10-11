package br.com.fujideia.iesp.tecback.repository;

import br.com.fujideia.iesp.tecback.model.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard,String>{
        }