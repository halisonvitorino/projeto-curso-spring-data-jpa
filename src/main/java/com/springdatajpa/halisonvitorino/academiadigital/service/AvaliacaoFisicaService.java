package com.springdatajpa.halisonvitorino.academiadigital.service;

import com.springdatajpa.halisonvitorino.academiadigital.entity.AvaliacaoFisicaEntity;
import com.springdatajpa.halisonvitorino.academiadigital.entity.form.AvaliacaoFisicaForm;
import com.springdatajpa.halisonvitorino.academiadigital.entity.form.AvaliacaoFisicaUpdateForm;

import java.util.List;

public interface AvaliacaoFisicaService {

    //Criar avaliacao e salvar no banco
    //@param form - formulario com dados da avaliacao
    //@return - avaliacao criada
    AvaliacaoFisicaEntity create(AvaliacaoFisicaForm form);

    //Busca avaliacao no banco por id
    //@param id - id da avaliacao
    //@return - avaliacao retornado conforme id
    AvaliacaoFisicaEntity get(Long id);

    //Busca todos os avaliacao no banco
    //@return - lista de avaliacao
    List<AvaliacaoFisicaEntity> getAll();

    //Atualiza avaliacao no banco por id
    //@param id - id do avaliacao
    //@param formUpdate - formulario com dados do avaliacao
    //@return - avaliacao retornado conforme id
    AvaliacaoFisicaEntity update(Long id, AvaliacaoFisicaUpdateForm formUpdate);

    //Apaga avaliacao por id
    //@param id - id da avaliacao
    void delete (Long id);
}
