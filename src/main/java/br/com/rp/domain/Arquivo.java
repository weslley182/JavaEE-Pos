package br.com.rp.domain;

import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;



public class Arquivo {
	private String dados;

	public String getDados() {
		return dados;
	}

	public void setDados(String dados) {
		this.dados = dados;
	}
	
	public void salvar(String pastaDestino) throws IOException{
		if(dados != null){
			Files.write(Paths.get(pastaDestino), dados.getBytes());
		}else{
			throw new RuntimeException("nao ha dados para salvar arquivo");
		}
			
	}
	
	
}
