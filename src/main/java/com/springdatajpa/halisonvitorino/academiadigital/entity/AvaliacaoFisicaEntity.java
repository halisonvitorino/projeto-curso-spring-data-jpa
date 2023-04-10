package com.springdatajpa.halisonvitorino.academiadigital.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_avaliacoes" )
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class AvaliacaoFisicaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aluno_id")
    private AlunoEntity alunoEntity;

    private LocalDateTime dataAvaliacao = LocalDate.now().atStartOfDay();

    @Column(name = "peso_atual")
    private double peso;

    @Column(name = "altura_atual")
    private double altura;

    @Column(name = "Imc_atual")
    private double imc;
}
