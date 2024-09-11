package com.joaoramos.ajuda_certa.repositories;

import com.joaoramos.ajuda_certa.entities.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
