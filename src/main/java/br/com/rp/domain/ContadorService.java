package br.com.rp.domain;

import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;

@Singleton
public class ContadorService {
	
	private int quantidade;
	
	@Lock(LockType.READ)
	public int retornarQuantidadeAcessos(){
		return quantidade;
	}
	
	@Lock(LockType.WRITE)
	public void realizarAcesso(){
		quantidade++;
	}

}
