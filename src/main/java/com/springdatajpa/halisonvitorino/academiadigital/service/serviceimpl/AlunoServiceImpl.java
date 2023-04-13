package com.springdatajpa.halisonvitorino.academiadigital.service.serviceimpl;

import com.springdatajpa.halisonvitorino.academiadigital.document.utils.JavaTimeUtils;
import com.springdatajpa.halisonvitorino.academiadigital.entity.AvaliacaoFisicaEntity;
import com.springdatajpa.halisonvitorino.academiadigital.repository.AlunoRepository;
import com.springdatajpa.halisonvitorino.academiadigital.entity.AlunoEntity;
import com.springdatajpa.halisonvitorino.academiadigital.entity.form.AlunoForm;
import com.springdatajpa.halisonvitorino.academiadigital.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public AlunoServiceImpl(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @Override
    public AlunoEntity create(AlunoForm form) {
        AlunoEntity aluno = new AlunoEntity();
        aluno.setName(form.getName());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataNascimento(form.getDataNascimento());
        return alunoRepository.save(aluno);
    }

    @Override
    public Optional<AlunoEntity> get(Long id) {
        return alunoRepository.findById(id);
    }

    @Override
    public List<AlunoEntity> getAll() {
        return alunoRepository.findAll();
    }

    @Override
    public AlunoEntity update(Long id, AlunoForm form) {
        AlunoEntity alunoAlterado = alunoRepository.findById(id).get();
        alunoAlterado.setName(form.getName());
        alunoAlterado.setBairro(form.getBairro());
        return alunoRepository.save(alunoAlterado);
    }

    @Override
    public void delete(Long id) {
        alunoRepository.deleteById(id);
    }

    @Override
    public List<AvaliacaoFisicaEntity> getAllAvaliacaoFisicaId(Long id) {
        AlunoEntity aluno = alunoRepository.findById(id).get();
        return aluno.getAvaliacoes();
    }

    @Override
    public List<AlunoEntity> getAllDataNascimento(String dataNascimento) {
            return alunoRepository.findByDataNascimento(dataNascimento);

    }
}
