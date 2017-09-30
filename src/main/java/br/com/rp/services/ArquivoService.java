package br.com.rp.services;

import java.io.IOException;

import javax.ejb.Stateless;

import br.com.rp.domain.Arquivo;

@Stateless
public class ArquivoService {
	
	private String CAMINHO = "D:\\work\\Arquivo.txt";
	
	public void salvar(Arquivo arquivo) throws IOException{
		arquivo.salvar(CAMINHO);
	}

}
