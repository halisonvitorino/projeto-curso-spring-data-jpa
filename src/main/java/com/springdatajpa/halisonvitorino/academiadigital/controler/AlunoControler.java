package com.springdatajpa.halisonvitorino.academiadigital.controler;

import com.springdatajpa.halisonvitorino.academiadigital.entity.AlunoEntity;
import com.springdatajpa.halisonvitorino.academiadigital.entity.AvaliacaoFisicaEntity;
import com.springdatajpa.halisonvitorino.academiadigital.entity.form.AlunoForm;
import com.springdatajpa.halisonvitorino.academiadigital.service.serviceimpl.AlunoServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//Controller só gerencia o fluxo das informações.
// Ela não deve conter regras de negocio e persistência em seu conteúdo.
@RestController
public class AlunoControler {

    @Autowired
    private AlunoServiceImpl alunoServiceImpl;

    @PostMapping("/alunos")
    public AlunoEntity create(@Valid @RequestBody AlunoForm form){
        return alunoServiceImpl.create(form);
    }

    //@PutMapping("/alunos/{id}")
    //public AlunoEntity update(@PathVariable("id") long id, AlunoForm form) {
        //return service.update(id, form);
    //}

    @GetMapping("/alunos")
    public List<AlunoEntity> getAll() {
        return alunoServiceImpl.getAll();
    }

    //busca específica por data de nascimento
    @GetMapping("/alunos/")
    public List<AlunoEntity> getALLDataNascimento(@RequestParam(value = "dataNascimento") String dataNascimento){
        return alunoServiceImpl.getAllDataNascimento(dataNascimento);
    }

    @GetMapping("/alunos/{id}" )
    public Optional<AlunoEntity> getOne(@PathVariable long id) {
        return alunoServiceImpl.get(id);
    }

    @GetMapping("/alunos/avaliacoes/{id}" )
    public List<AvaliacaoFisicaEntity> getAllAvaliacaoFisicaId(@PathVariable long id){
        return alunoServiceImpl.getAllAvaliacaoFisicaId(id);
    }

    @DeleteMapping("/alunos/{id}")
    public AlunoEntity delete(@PathVariable long id) {
        alunoServiceImpl.delete(id);
        return null;
    }
}
