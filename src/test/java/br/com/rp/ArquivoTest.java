package br.com.rp;

import static org.junit.Assert.*;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Test;

import br.com.rp.domain.Arquivo;

public class ArquivoTest {
	
	@Test
	public void deveSalvarArquivoComSucesso() throws Throwable{
		Arquivo arquivo = new Arquivo();
		arquivo.setDados("teste de registro");
		arquivo.salvar("D:\\JAVAEE\\Arquivo.txt");
		String dadosLidos = new String(Files.readAllBytes(Paths.get("D:\\JAVAEE\\Arquivo.txt")));
		assertEquals(dadosLidos, arquivo.getDados());		
	}
	
	@Test(expected = RuntimeException.class)
	public void naoDeveSalvarArquivoPorFaltaDeDados() throws Throwable{
		Arquivo arquivo = new Arquivo();
		arquivo.salvar("D:\\JAVAEE\\Arquivo.txt");
	}

}
