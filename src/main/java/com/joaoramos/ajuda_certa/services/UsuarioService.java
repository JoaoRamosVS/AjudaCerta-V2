package com.joaoramos.ajuda_certa.services;

import com.joaoramos.ajuda_certa.entities.usuario.Usuario;
import com.joaoramos.ajuda_certa.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public boolean verificarExistenciaUsuario(String email) {
        return this.usuarioRepository.findByEmail(email).isPresent();
    }

    public List<Usuario> listarTodosUsuarios() {
        return this.usuarioRepository.findAll();
    }

    public Usuario encontrarPorId(Long id) {
        // Criar nova exceção aqui.
        return this.usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuário não encontrado com ID: " + id));
    }

    public Usuario registrarUsuario(Usuario novoUsuario) {
        this.usuarioRepository.save(novoUsuario);
        return novoUsuario;
    }
}
