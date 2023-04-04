package com.springdatajpa.halisonvitorino.academiadigital.controler;

import com.springdatajpa.halisonvitorino.academiadigital.entity.AlunoEntity;
import com.springdatajpa.halisonvitorino.academiadigital.entity.AvaliacaoFisicaEntity;
import com.springdatajpa.halisonvitorino.academiadigital.entity.form.AlunoForm;
import com.springdatajpa.halisonvitorino.academiadigital.service.AlunoService;
import jakarta.persistence.PostUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AlunoControler {

    @Autowired
    private AlunoService alunoService;

    @PostMapping("/alunos")
    public AlunoEntity create(@RequestBody AlunoForm form){
        return alunoService.create(form);
    }

    //@PutMapping("/alunos/{id}")
    //public AlunoEntity update(@PathVariable("id") long id, AlunoForm form) {
        //return service.update(id, form);
    //}

    @GetMapping("/alunos")
    public List<AlunoEntity> getAll() {
        return alunoService.getAll();
    }

    @GetMapping("/alunos/{id}" )
    public Optional<AlunoEntity> getOne(@PathVariable long id) {
        return alunoService.get(id);
    }

    @GetMapping("/alunos/avaliacoes/{id}" )
    public List<AvaliacaoFisicaEntity> getAllAvaliacaoFisicaId(@PathVariable long id){
        return alunoService.getAllAvaliacaoFisicaId(id);
    }

    @DeleteMapping("/alunos/{id}")
    public AlunoEntity delete(@PathVariable long id) {
        alunoService.delete(id);
        return null;
    }
}
