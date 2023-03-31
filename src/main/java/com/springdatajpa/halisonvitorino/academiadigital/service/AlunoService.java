package com.springdatajpa.halisonvitorino.academiadigital.service;

import com.springdatajpa.halisonvitorino.academiadigital.entity.Aluno;
import com.springdatajpa.halisonvitorino.academiadigital.entity.form.AlunoForm;

import java.util.List;

public interface AlunoService {

    //Criar aluno e salvar no banco
    //@param form - formulario com dados do aluno
    //@return - aluno criado
    Aluno create(AlunoForm form);

    //Busca aluno no banco por id
    //@param id - id do aluno
    //@return - aluno retornado conforme id
    Aluno get(Long id);

    //Busca todos os alunos no banco
    //@return - lista de alunos
    List<Aluno> getAll();

    //Atualiza aluno no banco por id
    //@param id - id do aluno
    //@param formUpdadte - formulario com dados do aluno
    //@return - aluno retornado conforme id
    Aluno update(Long id, AlunoForm formUpdate);

    //Apaga aluno por id
    //@param id - id do aluno
    void delete (Long id);
}
