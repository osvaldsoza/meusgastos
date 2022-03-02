package br.com.monktec.meusgastos.entity;

import br.com.monktec.meusgastos.enums.Status;
import br.com.monktec.meusgastos.enums.TipoGasto;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Table(name = "tb_gasto")
@Entity
public class
Gasto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    private BigDecimal valor;

    @JsonProperty("dataVencimento")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataVencimento;

    @Enumerated(EnumType.STRING)
    private TipoGasto tipoGasto;

    @Enumerated(EnumType.STRING)
    private Status status;
}
