package br.com.rp.domain;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;



@Singleton
public class EstadoCacheService {
	private Map<String, Estados> estados = new HashMap<>();
	
	@PostConstruct
	public void carregarEstados(){
		try {
			Files.readAllLines(Paths.get("D:/Work/estados.txt")).stream()
				.forEach(linha ->{
				String[] estado = linha.split(";");
				Estados uf = new Estados();
				uf.setSigla(estado[0]);
				uf.setDescricao(estado[1]);
				estados.put(uf.getSigla(), uf);
				});
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	@Lock(LockType.READ)
	public Estados getEstadoPorSigla(String sigla){
		return estados.get(sigla);
	}
	
	public List<Estados> getEstados(){
		return estados.entrySet().stream().map(entry -> entry.getValue()).collect(Collectors.toList());
	}

}
