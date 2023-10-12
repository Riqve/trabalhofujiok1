package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class PagPix {

    @Id
    private String Remetente;
    private String Destinatario;
    private Double Valor;
    private Date DataHora;
}
