package com.springdatajpa.halisonvitorino.academiadigital.service.serviceimpl;

import com.springdatajpa.halisonvitorino.academiadigital.entity.AlunoEntity;
import com.springdatajpa.halisonvitorino.academiadigital.entity.MatriculaEntity;
import com.springdatajpa.halisonvitorino.academiadigital.entity.form.MatriculaForm;
import com.springdatajpa.halisonvitorino.academiadigital.repository.AlunoRepository;
import com.springdatajpa.halisonvitorino.academiadigital.repository.MatriculaRepository;
import com.springdatajpa.halisonvitorino.academiadigital.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class MatriculaServiceImpl implements MatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public MatriculaEntity create(MatriculaForm form) {
        MatriculaEntity matricula = new MatriculaEntity();
        AlunoEntity aluno = alunoRepository.findById(form.getAlunoId()).get();
        matricula.setDataMatricula(LocalDateTime.now());
        matricula.setAlunoEntity(aluno);
        return matriculaRepository.save(matricula);
    }

    @Override
    public Optional<MatriculaEntity> get(Long id){
        return matriculaRepository.findById(id);
    }

    @Override
    public List<MatriculaEntity> getAll() {
        return matriculaRepository.findAll();
    }

}
