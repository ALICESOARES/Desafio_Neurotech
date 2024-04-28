package br.com.desafio.neurotech.api.cep.rest.controller;

import br.com.desafio.neurotech.domain.CepService;
import br.com.desafio.neurotech.domain.dto.CepDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cep/v1")
@RequiredArgsConstructor
public class CepController {

    private final CepService cepService;

    @GetMapping("/{cep}")
    public ResponseEntity<CepDTO> getCep(@PathVariable String cep)  {

        CepDTO cepDTO = cepService.getCep(cep);

        return ResponseEntity.ok().body(cepDTO);

    }

}
