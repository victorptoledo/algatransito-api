package com.algaworks.algatransito.api.model;

import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
public class VeiculoModel {

    private Long id;
    private ProprietarioResumoModel proprietario;
    private String marca;
    private String modelo;
    private String numeroPlaca;
    private String status;
    private OffsetDateTime dataCadastro;
    private OffsetDateTime dataApreensao;
}