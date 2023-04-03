package com.springdatajpa.halisonvitorino.academiadigital.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_alunos" )
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class AlunoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique = true)
    private String cpf;
    private String bairro;
    private LocalDate dataNascimento;

    @OneToMany(mappedBy = "alunoEntity", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<AvaliacaoFisicaEntity> avaliacoes = new ArrayList<>();
}
