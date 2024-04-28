package br.com.desafio.neurotech.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CepDTO {

    private String cep;
    private String uf;
    private String cidade;
    private String vizinhanca;
    private String rua;
}
