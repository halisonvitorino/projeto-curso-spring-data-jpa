package com.springdatajpa.halisonvitorino.academiadigital.service;

import com.springdatajpa.halisonvitorino.academiadigital.entity.Matricula;
import com.springdatajpa.halisonvitorino.academiadigital.entity.form.MatriculaForm;

import java.util.List;

public interface MatriculaService {

    //Criar matricula e salvar no banco
    //@param form - formulario com dados da matricula
    //@return - matricula criado
    Matricula create(MatriculaForm form);

    //Busca matricula no banco por id
    //@param id - id da matricula
    //@return - matricula retornado conforme id
    Matricula get(Long id);

    //Busca todos os matricula no banco
    //@return - lista de matricula
    List<Matricula> getAll();

    //Apaga matricula por id
    //@param id - id da matricula
    void delete (Long id);
}
