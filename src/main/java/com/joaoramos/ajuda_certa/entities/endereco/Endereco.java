package com.joaoramos.ajuda_certa.entities.endereco;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_endereco")
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Endereco {
    @Id
    @Column(name = "endereco_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rua", nullable = false)
    private String rua;

    @Column(name = "numero", nullable = false)
    private String numero;

    @Column(name = "bairro", nullable = false)
    private String bairro;

    @Column(name = "complemento")
    private String complemento;

    @Column(name = "bloco")
    private String bloco;

    @Column(name = "cep", columnDefinition = "char(8)", nullable = false)
    private String cep;
}
