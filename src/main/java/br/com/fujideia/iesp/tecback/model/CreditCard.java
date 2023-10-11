package br.com.fujideia.iesp.tecback.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class CreditCard {

    private String Titular;
    @Id
    private String CPF;
    private Integer numCard;
    private Integer Validade;
    private Integer cvv;

}
