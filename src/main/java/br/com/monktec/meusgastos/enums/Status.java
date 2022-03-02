package br.com.monktec.meusgastos.enums;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

public enum Status {

    @JsonProperty("Pago")
    PAGO("Pago"),

    @JsonProperty("A pagar")
    A_PAGAR("A pagar");

    @Getter
    private String value;

    Status(String value) {
        this.value = value;
    }

}
