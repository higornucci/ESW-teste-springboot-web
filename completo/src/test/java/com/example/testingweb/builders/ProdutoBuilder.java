package com.example.testingweb.builders;

import com.example.testingweb.produto.Produto;
import com.example.testingweb.produto.ValorInvalidoException;

public class ProdutoBuilder {

    private String descricao;
    private double valorUnitario;

    public ProdutoBuilder comValorUnitario(double valorUnitarioEsperado) {
        this.valorUnitario = valorUnitarioEsperado;
        return this;
    }

    public ProdutoBuilder comDescricao(String descricaoEsperada) {
        this.descricao = descricaoEsperada;
        return this;
    }

    public Produto construir() throws ValorInvalidoException {
        Produto produto = new Produto(descricao, valorUnitario);
        return produto;
    }


}
