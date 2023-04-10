package com.springdatajpa.halisonvitorino.academiadigital.service.serviceimpl;

import com.springdatajpa.halisonvitorino.academiadigital.entity.AlunoEntity;
import com.springdatajpa.halisonvitorino.academiadigital.entity.AvaliacaoFisicaEntity;
import com.springdatajpa.halisonvitorino.academiadigital.entity.form.AvaliacaoFisicaForm;
import com.springdatajpa.halisonvitorino.academiadigital.entity.form.AvaliacaoFisicaUpdateForm;
import com.springdatajpa.halisonvitorino.academiadigital.repository.AlunoRepository;
import com.springdatajpa.halisonvitorino.academiadigital.repository.AvaliacaoFisicaRepository;
import com.springdatajpa.halisonvitorino.academiadigital.service.AvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Optional;

@Service
public class AvaliacaoFisicaServiceImpl implements AvaliacaoFisicaService{

    @Autowired
    private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public AvaliacaoFisicaEntity create(AvaliacaoFisicaForm form) {

        double peso;
        double altura;
        double imc;

        AvaliacaoFisicaEntity avaliacaoFisica = new AvaliacaoFisicaEntity();
        AlunoEntity aluno = alunoRepository.findById(form.getAlunoId()).get();
        avaliacaoFisica.setAlunoEntity(aluno);
        avaliacaoFisica.setPeso(form.getPeso());
        avaliacaoFisica.setAltura(form.getAltura());

        peso   = form.getPeso();
        altura = form.getAltura();
        DecimalFormat fmt = new DecimalFormat("##.##");
        imc = Double.valueOf(fmt.format(peso/(Math.pow(altura, 2))));
        avaliacaoFisica.setImc(imc);

        return avaliacaoFisicaRepository.save(avaliacaoFisica);
    }

    @Override
    public Optional<AvaliacaoFisicaEntity> get(Long id) {
        return avaliacaoFisicaRepository.findById(id);
    }

    @Override
    public List<AvaliacaoFisicaEntity> getAll() {
        return avaliacaoFisicaRepository.findAll();
    }

    @Override
    public AvaliacaoFisicaEntity update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {
        avaliacaoFisicaRepository.deleteById(id);
    }
}
