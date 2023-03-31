package com.springdatajpa.halisonvitorino.academiadigital.entity;

import java.time.LocalDateTime;

public class Matricula {

    private Long id;
    private Aluno aluno;
    private LocalDateTime dataMatricula = LocalDateTime.now();
}
