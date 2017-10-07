package br.com.rp.repository;

import static org.junit.Assert.assertEquals;

import javax.ejb.EJB;

import org.junit.Test;

import br.com.rp.AbstractTest;
import br.com.rp.domain.Pessoa;


public class PessoaRepositoryTest extends AbstractTest{

	@EJB
	private PessoaRepository repo;
	
	@Test
	public void deveSalvarRegistroComSucesso() throws Throwable{
		Pessoa p = new Pessoa();
		p.setNome("Wesley");
		p.setCpf("310.145.518-97");		
		repo.save(p);		
		Pessoa result = repo.findById(p.getId());		
		assertEquals(p.getNome(), result.getNome());		
	}
	
	@Test(expected = RuntimeException.class)
	public void naoDeveSalvarPessoaPorDuplicidadeCPF() throws Throwable{
		Pessoa p1 = new Pessoa();
		p1.setNome("Wesley");
		p1.setCpf("31014551897");
		repo.save(p1);
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Will");
		p2.setCpf("31014551897");
		repo.save(p2);
		
	}
	
	@Test(expected = RuntimeException.class)
	public void naoDeveSalvarPessoaMenoriIdade() throws Throwable{
		Pessoa p1 = new Pessoa();
		p1.setNome("Wesley");
		p1.setCpf("31014551897");
		p1.setIdade(17);
		repo.save(p1);		
	}
}
