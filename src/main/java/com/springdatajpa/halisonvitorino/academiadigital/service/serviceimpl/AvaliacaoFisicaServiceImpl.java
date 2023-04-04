package com.springdatajpa.halisonvitorino.academiadigital.service.serviceimpl;

import com.springdatajpa.halisonvitorino.academiadigital.entity.AvaliacaoFisicaEntity;
import com.springdatajpa.halisonvitorino.academiadigital.entity.form.AvaliacaoFisicaForm;
import com.springdatajpa.halisonvitorino.academiadigital.entity.form.AvaliacaoFisicaUpdateForm;
import com.springdatajpa.halisonvitorino.academiadigital.repository.AlunoRepository;
import com.springdatajpa.halisonvitorino.academiadigital.repository.AvaliacaoFisicaRepository;
import com.springdatajpa.halisonvitorino.academiadigital.service.AvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AvaliacaoFisicaServiceImpl implements AvaliacaoFisicaService{

    @Autowired
    private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

    @Override
    public AvaliacaoFisicaEntity create(AvaliacaoFisicaForm form) {
        return null;
    }

    @Override
    public AvaliacaoFisicaEntity get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisicaEntity> getAll() {
        return null;
    }

    @Override
    public AvaliacaoFisicaEntity update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
