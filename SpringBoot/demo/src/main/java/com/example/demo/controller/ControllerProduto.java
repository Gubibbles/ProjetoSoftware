package com.example.demo.controller;


import com.example.demo.model.DadosCadastroRoupa;
import com.example.demo.model.Roupa;
import com.example.demo.repository.RoupaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roupa")
public class ControllerProduto {

    @Autowired
    private RoupaRepository roupaRepository;

    @PostMapping
    public void cadastrarProduto(@RequestBody DadosCadastroRoupa dados) {
        roupaRepository.save(new Roupa(dados));
    }

    @GetMapping
    public List<Roupa> listarProduto() {
        return roupaRepository.findAll();
    }
}
