package br.com.rp;

import static org.junit.Assert.assertEquals;

import javax.ejb.EJB;

import org.junit.Test;

import br.com.rp.domain.ContadorService;

public class ContadorTest extends AbstractTest{
	
	@EJB
	private ContadorService cont;
	
	@Test
	public void deveAcessarTresVezes() throws Throwable{
		cont.realizarAcesso();
		cont.realizarAcesso();		
		cont.realizarAcesso();
		assertEquals(3, cont.retornarQuantidadeAcessos());		
	}

}
