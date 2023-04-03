package com.springdatajpa.halisonvitorino.academiadigital.service.serviceimpl;

import com.springdatajpa.halisonvitorino.academiadigital.repository.AlunoRepository;
import com.springdatajpa.halisonvitorino.academiadigital.entity.AlunoEntity;
import com.springdatajpa.halisonvitorino.academiadigital.entity.form.AlunoForm;
import com.springdatajpa.halisonvitorino.academiadigital.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;
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
    public AlunoEntity get(Long id) {
        return null;
    }

    //public AlunoEntity get(String name) {
        //return (AlunoEntity) alunoRepository.findAll(name);
    //}

    @Override
    public List<AlunoEntity> getAll() {
        return alunoRepository.findAll();
    }

    @Override
    public AlunoEntity update(Long id, AlunoForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
