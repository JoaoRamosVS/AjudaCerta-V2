package com.joaoramos.ajuda_certa.entities.usuario;

import com.joaoramos.ajuda_certa.enums.TipoPessoaEnum;
import com.joaoramos.ajuda_certa.enums.TipoUsuarioEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
    @Column(name = "usuario_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "tipo_usuario", nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoUsuarioEnum tipoUsuario;

    @Column(name = "tipo_pessoa", nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoPessoaEnum tipoPessoa;

    @Column(name = "documento", nullable = false)
    private String documento;

    @Column(name = "data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @Column(name = "genero", nullable = false)
    private String genero;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "senha", nullable = false)
    private String senha;

    @Column(name = "ultimo_acesso", nullable = false)
    private LocalDateTime ultimoAcesso;

    @Transient
    private int numeroTentativas;

    @Column(name = "foto")
    private String foto;
}
