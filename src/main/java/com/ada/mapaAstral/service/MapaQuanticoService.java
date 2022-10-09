package com.ada.mapaAstral.service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class MapaQuanticoService  {

    public List<String> lerArquivo(Path path){
        List<String>integrantes;
        try {
            integrantes = Files.lines(path).map(linha->linha + "\n").collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return integrantes;
    }

        public void escreverArquivo (Path path, String textoIntegrantes ){
        try {
            if(!Files.exists(path)){
                Files.createFile(path);
            }
            Files.write(path,textoIntegrantes.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
