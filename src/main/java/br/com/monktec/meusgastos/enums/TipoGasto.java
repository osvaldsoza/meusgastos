package br.com.monktec.meusgastos.enums;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;


public enum TipoGasto {
    @JsonProperty("Moradia")
    MORADIA("Moradia"),

    @JsonProperty("Financiamento")
    FINANCIAMENTO("Financiamento"),

    @JsonProperty("Emprestimo")
    EMPRESTIMO("Emprestimo"),

    @JsonProperty("Telefonia")
    TELEFONIA("Telefonia"),

    @JsonProperty("Curso")
    CURSO("Curso"),

    @JsonProperty("Cartão")
    CARTAO("Cartão"),

    @JsonProperty("Telefonia")
    ATIVIDADE_FISICA("Telefonia"),

    @JsonProperty("Outros")
    OUTROS("Outros");

    @Getter
    private String value;

    TipoGasto(String value){
        this.value = value;
    }


}
