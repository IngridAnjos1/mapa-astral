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


		// Parallel
		// lendo arquivo

	 	Path pathArquivo = Paths.get(pathPasta,"integrantes.txt");

		List<String> listaIntegrantes = mapaQuanticoService.lerArquivo(pathArquivo);
		listaIntegrantes.forEach(System.out::println);

		// escrevendo arquivo

		Path pathArquivoTest = Paths.get(pathPasta,"TextoTest.txt");
		mapaQuanticoService.escreverArquivo(pathArquivoTest, "Testando o arquivo");
		System.out.println(mapaQuanticoService.criarMapaQuantico2(listaIntegrantes));



		/* Mapa Astral

		LocalDateTime localDateTimeLucas = LocalDateTime.of(1992, Month.DECEMBER, 16, 12, 35);
		LocalDateTime localDateTimeTomas = LocalDateTime.of(1999, Month.AUGUST, 30, 12, 30);
		LocalDateTime localDateTimeArthur = LocalDateTime.of(1987, Month.MARCH, 25, 19, 30);
		LocalDateTime localDateTimeIngrid = LocalDateTime.of(1990, Month.SEPTEMBER, 17, 18, 30);


		//LocalDate localDateLucas = LocalDate.of(localDateTimeLucas.getYear(),localDateTimeLucas.getMonth(),localDateTimeLucas.getDayOfMonth());


		//Lucas

		String signoLucas = mapaAstralService.buscaPorSigno(localDateTimeLucas.toLocalDate());
		String signoAscendenteLucas = mapaAstralService.procurarAscendente(signoLucas, LocalTime.from(localDateTimeLucas));
		String buscaSignoPorEnunLucas = mapaAstralService.buscaSignoPorEnun(localDateTimeLucas);
		mapaAstralService.mapaAstral(localDateTimeLucas);
		String localizarSingnoLunarLucas = mapaAstralService.localizarSingnoLunar(LocalTime.from(localDateTimeLucas),"Recife");
		System.out.println(localizarSingnoLunarLucas);

		//Ingrid

		String signoIngrid = mapaAstralService.buscaPorSigno(localDateTimeIngrid.toLocalDate());
		String signoAscendenteIngrid = mapaAstralService.procurarAscendente(signoIngrid, LocalTime.from(localDateTimeIngrid));
		String buscaSignoPorEnunIngrid = mapaAstralService.buscaSignoPorEnun(localDateTimeIngrid);
		mapaAstralService.mapaAstral(localDateTimeIngrid);

		String localizarSingnoLunarIngrid = mapaAstralService.localizarSingnoLunar(LocalTime.from(localDateTimeIngrid),"Sao_Paulo");
		System.out.println(localizarSingnoLunarIngrid);
	}
}

*/


	}
	}