package com.springdatajpa.halisonvitorino.academiadigital.controler;

import com.springdatajpa.halisonvitorino.academiadigital.entity.AvaliacaoFisicaEntity;
import com.springdatajpa.halisonvitorino.academiadigital.entity.form.AvaliacaoFisicaForm;
import com.springdatajpa.halisonvitorino.academiadigital.service.serviceimpl.AvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class AvaliacaoFisicaControler {

    @Autowired
    private AvaliacaoFisicaServiceImpl avaliacaoFisicaServiceImpl;

    @PostMapping("/avaliacoes")
    public AvaliacaoFisicaEntity create(@RequestBody AvaliacaoFisicaForm form){
        return avaliacaoFisicaServiceImpl.create(form);
    }

    //@PutMapping("/avaliacoes/{id}")
    //public AlunoEntity update(@PathVariable("id") long id, AvaliacaoFisicaForm form) {
        //return service.update(id, form);
    //}

    @GetMapping("/avaliacoes")
    public List<AvaliacaoFisicaEntity> getAll() {
        return avaliacaoFisicaServiceImpl.getAll();
    }

    @GetMapping("/avaliacoes/{id}" )
    public Optional<AvaliacaoFisicaEntity> getOne(@PathVariable long id) {
        return avaliacaoFisicaServiceImpl.get(id);
    }

    @DeleteMapping("/avaliacoes/{id}")
    public AvaliacaoFisicaEntity delete(@PathVariable long id) {
        avaliacaoFisicaServiceImpl.delete(id);
        return null;
    }
}
