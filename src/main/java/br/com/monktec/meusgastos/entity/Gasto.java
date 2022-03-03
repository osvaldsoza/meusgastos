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
import java.util.UUID;

@Getter
@Setter
@Table(name = "tb_gasto")
@Entity
public class
Gasto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID id;

    private String descricao;

    private BigDecimal valor;

    @JsonProperty("dataVencimento")
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "data_vencimento")
    private LocalDate dataVencimento;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_gasto")
    private TipoGasto tipoGasto;

    @Enumerated(EnumType.STRING)
    private Status status;
}
