package br.com.rp.repository.impl;

import static org.junit.Assert.assertEquals;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Test;

import br.com.rp.domain.Arquivo;
import br.com.rp.domain.Pessoa;


public class TestPessoaRepositoryImpl{

	private PessoaRepositoryImpl repo;
	
	@Test
	public void deveSalvarRegistroComSucesso() throws Throwable{
		Pessoa p = new Pessoa();
		p.setNome("Wesley");
		p.setCpf("310.145.518-97");
		repo.save(p);
		
		String dadosLidos = new String(Files.readAllBytes(Paths.get("D:\\JAVAEE\\Arquivo.txt")));
		assertEquals(dadosLidos, arquivo.getDados());		
	}
}
