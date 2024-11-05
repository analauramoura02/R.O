package com.example.Gestao.RO.enums;

public enum Periodo {
    MANHA("Manha"),
    TARDE("Tarde"),
    NOITE("Noite"),
    INTEGRAL("Integral");

    private String descricao;

    Periodo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
