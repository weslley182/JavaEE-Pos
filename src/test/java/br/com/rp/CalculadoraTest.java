package br.com.rp;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import javax.ejb.EJB;

import org.junit.Test;

import br.com.rp.services.CalculadoraService;

public class CalculadoraTest extends AbstractTest{
	
	@EJB
	private CalculadoraService serv;

	@Test
	public void deveSomarLista() throws Throwable {
		ArrayList <Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(30);
		list.add(30);
		list.add(30);
		list.add(30);
		list.add(30);
		list.add(30);
		list.add(30);
		list.add(30);
		list.add(30);
		list.add(30);
		list.add(30);		
		assertEquals(390, serv.calcularSoma(list));
	}
	
	@Test
	public void deveTrazerMediaLista() throws Throwable {
		ArrayList <Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		assertEquals(20, serv.calcularMedia(list));
	}

}
