package com.joaoramos.ajuda_certa.repositories;

import com.joaoramos.ajuda_certa.entities.endereco.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
