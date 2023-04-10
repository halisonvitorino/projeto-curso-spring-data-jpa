package com.springdatajpa.halisonvitorino.academiadigital.controler;

import com.springdatajpa.halisonvitorino.academiadigital.entity.MatriculaEntity;
import com.springdatajpa.halisonvitorino.academiadigital.entity.form.MatriculaForm;
import com.springdatajpa.halisonvitorino.academiadigital.service.MatriculaService;
import com.springdatajpa.halisonvitorino.academiadigital.service.serviceimpl.MatriculaServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
public class MatriculaControler {

    @Autowired
    private MatriculaServiceImpl matriculaServiceImpl;

    @PostMapping("/matriculas")
    public MatriculaEntity create(@Valid @RequestBody MatriculaForm form){
        return matriculaServiceImpl.create(form);
    }

    @GetMapping("/matriculas/{id}")
    public Optional<MatriculaEntity> getOne(@PathVariable long id){
        return matriculaServiceImpl.get(id);
    }

}
