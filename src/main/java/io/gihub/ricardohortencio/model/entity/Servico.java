package io.gihub.ricardohortencio.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import lombok.Data;
import javax.persistence.GenerationType;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Servico{

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(nullable = false, length = 150)
    private String descricao;


    @JoinColumn(name = "id_cliente")
    @ManyToOne
    private Cliente cliente;

    @Column (name = "valor")
    private BigDecimal valor;

}
