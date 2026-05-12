package com.example.demo.dto;

import com.example.demo.model.Tamanho;

public record DadosAtualizarRoupa(
        Long id,
        String nomeProduto,
        String marca,
        Tamanho tamanho,
        double preco,
        int quantidade

) {
}
