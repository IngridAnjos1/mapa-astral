package com.ada.mapaAstral.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class MapaQuantico {
    private String nome;
    private String signo;
    private String ascendente;
    private String localNascimento;
    private LocalDateTime horaNascimento;
    private Integer idade;

}