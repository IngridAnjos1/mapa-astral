package com.ada.mapaAstral;

import com.ada.mapaAstral.service.MapaAstralService;
import com.ada.mapaAstral.service.MapaQuanticoService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@SpringBootApplication
public class MapaAstralApplication {

	private static String HOME = System.getProperty("user.dir");
	private static String pathPasta = HOME.concat("/src/main/resources/mapa");

	public static void main(String[] args) {
		MapaAstralService mapaAstralService = new MapaAstralService();
		MapaQuanticoService mapaQuanticoService = new MapaQuanticoService(mapaAstralService);


		// lendo arquivo

		Path pathArquivo = Paths.get(pathPasta, "integrantes.txt");

		List<String> listaIntegrantes = mapaQuanticoService.lerArquivo(pathArquivo);
		listaIntegrantes.forEach(System.out::println);

		// escrevendo arquivo -com Parallel

		mapaQuanticoService.escreverMapaQuantico(listaIntegrantes);

	}
}