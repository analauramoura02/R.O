package com.example.Gestao.RO.enums;

public enum Funcao {

    PROFESSOR("Professor"),
    DIRETOR("Diretor"),
    SECRETARIO("Secretário");

    private String descricao;

    Funcao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
