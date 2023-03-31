package com.springdatajpa.halisonvitorino.academiadigital.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private Long id;
    private String name;
    private String cpf;
    private String bairro;
    private LocalDate dataNascimento;
    private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();

}
