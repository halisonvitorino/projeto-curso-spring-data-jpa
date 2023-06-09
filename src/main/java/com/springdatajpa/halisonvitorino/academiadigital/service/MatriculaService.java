package com.springdatajpa.halisonvitorino.academiadigital.service;

import com.springdatajpa.halisonvitorino.academiadigital.entity.MatriculaEntity;
import com.springdatajpa.halisonvitorino.academiadigital.entity.form.MatriculaForm;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MatriculaService {

    //Criar matricula e salvar no banco
    //@param form - formulario com dados da matricula
    //@return - matricula criado
    MatriculaEntity create(MatriculaForm form);

    //Busca matricula no banco por id
    //@param id - id da matricula
    //@return - matricula retornado conforme id
    Optional<MatriculaEntity> get(Long id);

    //Busca todos os matricula no banco
    //@return - lista de matricula
    List<MatriculaEntity> getAll();

    //Apaga matricula por id
    //@param id - id da matricula
    //void delete (Long id);
}
