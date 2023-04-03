package com.springdatajpa.halisonvitorino.academiadigital.service;

import com.springdatajpa.halisonvitorino.academiadigital.entity.AlunoEntity;
import com.springdatajpa.halisonvitorino.academiadigital.entity.form.AlunoForm;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AlunoService {

    //Criar aluno e salvar no banco
    //@param form - formulario com dados do aluno
    //@return - aluno criado
    AlunoEntity create(AlunoForm form);

    //Busca aluno no banco por id
    //@param id - id do aluno
    //@return - aluno retornado conforme id
    AlunoEntity get(Long id);

    //Busca aluno no banco por nome
    //@param nome - Nome do aluno
    //@return - aluno retornado conforme id
    //AlunoEntity get(String name);

    //Busca todos os alunos no banco
    //@return - lista de alunos
    List<AlunoEntity> getAll();

    //Atualiza aluno no banco por id
    //@param id - id do aluno
    //@param formUpdadte - formulario com dados do aluno
    //@return - aluno retornado conforme id
    AlunoEntity update(Long id, AlunoForm formUpdate);

    //Apaga aluno por id
    //@param id - id do aluno
    void delete (Long id);
}
