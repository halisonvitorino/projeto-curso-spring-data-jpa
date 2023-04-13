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

@Data               //provê getters, setters, etc
@NoArgsConstructor  //construtor vazio
@AllArgsConstructor //construtor completo
@Entity
@Table(name = "tb_alunos" )
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class AlunoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true) //nao permite repetir cpf's
    private String cpf;

    private String bairro;

    private String dataNascimento;

    @OneToMany(mappedBy = "alunoEntity", fetch = FetchType.LAZY) //carrega alunos mas nao carrega avaliações
    @JsonIgnore                                                  //ignora erros json
    private List<AvaliacaoFisicaEntity> avaliacoes = new ArrayList<>();
}
