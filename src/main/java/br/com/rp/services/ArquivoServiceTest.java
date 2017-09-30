package br.com.rp.services;

import static org.junit.Assert.assertEquals;

import java.nio.file.Files;
import java.nio.file.Paths;

import javax.ejb.EJB;

import org.junit.Test;

import br.com.rp.AbstractTest;
import br.com.rp.domain.Arquivo;

public class ArquivoServiceTest extends AbstractTest{
	
	@EJB
	private ArquivoService service;
	
	@Test
	public void deveSalvarArquivo() throws Throwable{
		Arquivo arquivo = new Arquivo();
		arquivo.setDados("teste");
		service.salvar(arquivo);
		String dadosLidos = new String(Files.readAllBytes(Paths.get("D:\\work\\Arquivo.txt")));
		assertEquals(dadosLidos, arquivo.getDados());		
	}

}
