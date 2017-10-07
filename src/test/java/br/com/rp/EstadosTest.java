package br.com.rp;

import static org.junit.Assert.*;

import javax.ejb.EJB;

import org.junit.Test;

import br.com.rp.domain.EstadoCacheService;
import br.com.rp.domain.Estados;

public class EstadosTest extends AbstractTest{
	
	@EJB
	private EstadoCacheService serv;
	
	@Test
	public void deveBuscarEstadoParana() throws Throwable{
		Estados e = new Estados();				
		e = serv.getEstadoPorSigla("PR");				
		assertEquals(e.getDescricao(), "Parana");		
	}

	@Test
	public void deveDarErro() throws Throwable{
		Estados e = new Estados();				
		e = serv.getEstadoPorSigla("PR");				
		assertFalse(e.getDescricao() == "Sao Paulo");		
	}	

}
