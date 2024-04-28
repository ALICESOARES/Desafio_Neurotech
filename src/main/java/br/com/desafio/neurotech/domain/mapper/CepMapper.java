package br.com.desafio.neurotech.domain.mapper;

import br.com.desafio.neurotech.domain.dto.CepDTO;
import br.com.desafio.neurotech.persistence.entites.CepEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CepMapper {

    @Mapping(target = "uf", source = "state")
    @Mapping(target = "cidade", source = "city")
    @Mapping(target = "vizinhanca", source = "neighborhood")
    @Mapping(target = "rua", source = "street")
    CepDTO toCepDTO(CepEntity cepEntity);

}
