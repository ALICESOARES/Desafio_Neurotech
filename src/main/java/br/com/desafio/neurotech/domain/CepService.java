package br.com.desafio.neurotech.domain;

import br.com.desafio.neurotech.domain.dto.CepDTO;
import br.com.desafio.neurotech.domain.mapper.CepMapper;
import br.com.desafio.neurotech.persistence.entites.CepEntity;
import br.com.desafio.neurotech.persistence.repository.CepRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
@RequiredArgsConstructor
public class CepService {

    private final CepMapper cepMapper;
    private final CepRepository cepRepository;
    private static final String URI_API = "https://brasilapi.com.br/api/cep/v1/";

    public CepDTO getCep(String cep) {

        CepEntity cepEntity = requestGetCep(cep);
        cepRepository.save(cepEntity);

        return cepMapper.toCepDTO(cepEntity);

    }

    public CepEntity requestGetCep(String cep) {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URI_API + cep))
                .GET()
                .build();

        HttpResponse<String> response = null;
        CepEntity cepEntity = null;
        ObjectMapper objectMapper = new ObjectMapper();

        try {

            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            cepEntity = objectMapper.readValue(response.body(), CepEntity.class);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        return cepEntity;
    }
}
