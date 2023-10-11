package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "tb_esporte")
public class Esporte {


    @Id
    @GeneratedValue
    private Integer id;

    private String titulo;

    @Column(name = "ds_descrição", length = 500)
    private String descricao;


}
