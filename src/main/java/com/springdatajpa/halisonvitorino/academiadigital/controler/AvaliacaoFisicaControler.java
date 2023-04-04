package com.springdatajpa.halisonvitorino.academiadigital.controler;

import com.springdatajpa.halisonvitorino.academiadigital.entity.AvaliacaoFisicaEntity;
import com.springdatajpa.halisonvitorino.academiadigital.entity.form.AvaliacaoFisicaForm;
import com.springdatajpa.halisonvitorino.academiadigital.service.AvaliacaoFisicaService;
import com.springdatajpa.halisonvitorino.academiadigital.service.serviceimpl.AvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AvaliacaoFisicaControler {

    @Autowired
    private AvaliacaoFisicaService avaliacaoFisicaService;

    @PostMapping("/avaliacoes")
    public AvaliacaoFisicaEntity create(@RequestBody AvaliacaoFisicaForm form){
        return avaliacaoFisicaService.create(form);
    }

    //@PutMapping("/avaliacoes/{id}")
    //public AlunoEntity update(@PathVariable("id") long id, AvaliacaoFisicaForm form) {
        //return service.update(id, form);
    //}

    @GetMapping("/avaliacoes")
    public List<AvaliacaoFisicaEntity> getAll() {
        return avaliacaoFisicaService.getAll();
    }

    @GetMapping("/avaliacoes/{id}" )
    public Optional<AvaliacaoFisicaEntity> getOne(@PathVariable long id) {
        return Optional.ofNullable(avaliacaoFisicaService.get(id));
    }

    @DeleteMapping("/avaliacoes/{id}")
    public AvaliacaoFisicaEntity delete(@PathVariable long id) {
        avaliacaoFisicaService.delete(id);
        return null;
    }
}
