package com.springdatajpa.halisonvitorino.academiadigital.service;

import com.springdatajpa.halisonvitorino.academiadigital.entity.Aluno;
import com.springdatajpa.halisonvitorino.academiadigital.entity.AvaliacaoFisica;
import com.springdatajpa.halisonvitorino.academiadigital.entity.Matricula;
import com.springdatajpa.halisonvitorino.academiadigital.entity.form.AvaliacaoFisicaForm;
import com.springdatajpa.halisonvitorino.academiadigital.entity.form.AvaliacaoFisicaUpdateForm;

import java.util.List;

public interface AvaliacaoFisicaService {

    //Criar avaliacao e salvar no banco
    //@param form - formulario com dados da avaliacao
    //@return - avaliacao criada
    AvaliacaoFisica create(AvaliacaoFisicaForm form);

    //Busca avaliacao no banco por id
    //@param id - id da avaliacao
    //@return - avaliacao retornado conforme id
    AvaliacaoFisica get(Long id);

    //Busca todos os avaliacao no banco
    //@return - lista de avaliacao
    List<AvaliacaoFisica> getAll();

    //Atualiza avaliacao no banco por id
    //@param id - id do avaliacao
    //@param formUpdate - formulario com dados do avaliacao
    //@return - avaliacao retornado conforme id
    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);

    //Apaga avaliacao por id
    //@param id - id da avaliacao
    void delete (Long id);
}
