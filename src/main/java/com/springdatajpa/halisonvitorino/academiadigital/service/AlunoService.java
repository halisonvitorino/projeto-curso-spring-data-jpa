package com.springdatajpa.halisonvitorino.academiadigital.service;

import com.springdatajpa.halisonvitorino.academiadigital.entity.AlunoEntity;
import com.springdatajpa.halisonvitorino.academiadigital.entity.AvaliacaoFisicaEntity;
import com.springdatajpa.halisonvitorino.academiadigital.entity.form.AlunoForm;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AlunoService {

    //Criar aluno e salvar no banco
    //@param form - formulario com dados do aluno
    //@return - aluno criado
    AlunoEntity create(AlunoForm form);

    //Busca aluno no banco por id
    //@param id - id do aluno
    //@return - aluno retornado conforme id
    Optional<AlunoEntity> get(Long id) throws ChangeSetPersister.NotFoundException;

    //Busca aluno no banco por nome
    //@param nome - Nome do aluno
    //@return - aluno retornado conforme id
   //Optional<AlunoEntity> getAll(String name);

    //Busca todos os alunos no banco
    //@return - lista de alunos
    List<AlunoEntity> getAll();

    //Busca todos os alunos no banco pela data do nascimento
    List<AlunoEntity> getAllDataNascimento(String dataNascimento);

    //Atualiza aluno no banco por id
    //@param id - id do aluno
    //@param formUpdadte - formulario com dados do aluno
    //@return - aluno retornado conforme id
    AlunoEntity update(Long id, AlunoForm form);

    //Apaga aluno por id
    //@param id - id do aluno
    void delete (Long id);

    List<AvaliacaoFisicaEntity> getAllAvaliacaoFisicaId(Long id);
}
