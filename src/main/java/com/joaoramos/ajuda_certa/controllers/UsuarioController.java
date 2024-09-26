package com.joaoramos.ajuda_certa.controllers;

import com.joaoramos.ajuda_certa.entities.usuario.Usuario;
import com.joaoramos.ajuda_certa.services.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @GetMapping("/{usuarioId}")
    public ResponseEntity<Usuario> getById(@PathVariable Long usuarioId) {
        Usuario usuario = this.usuarioService.encontrarPorId(usuarioId);
        return ResponseEntity.ok(usuario);
    }
}
