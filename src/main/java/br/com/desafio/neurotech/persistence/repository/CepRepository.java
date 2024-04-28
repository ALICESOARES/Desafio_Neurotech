package br.com.desafio.neurotech.persistence.repository;

import br.com.desafio.neurotech.persistence.entites.CepEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CepRepository extends JpaRepository<CepEntity, Long> {

}
