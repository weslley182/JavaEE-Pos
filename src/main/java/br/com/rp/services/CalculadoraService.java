package br.com.rp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class CalculadoraService {
	
	@EJB
	private CalculadoraServiceAssinc calc;
	
	private ArrayList<Integer> novaLista;
	
	public int calcularSoma(List<Integer> lista) throws InterruptedException, ExecutionException{
		int valor = 0;
		novaLista = new ArrayList<Integer>();		
		for(int i= 0; i < lista.size();i++){
			novaLista.add(lista.get(i));
			if((i % 9 == 0)||((lista.size()-1) == i)){
				Future<Integer> result = calc.calcularSomaAssinc(novaLista);
				novaLista.clear();				
				valor = valor + (int)result.get();				
			}			
		}
		return valor;
	}
	
	public int calcularMedia(List<Integer> lista) throws InterruptedException, ExecutionException{
		int valor = 0;
		novaLista = new ArrayList<Integer>();		
		for(int i= 0; i < lista.size();i++){
			novaLista.add(lista.get(i));
			if((i % 9 == 0)||((lista.size()-1) == i)){
				Future<Integer> result = calc.calcularMediaAssinc(novaLista);
				novaLista.clear();			
				valor = valor + (int)result.get();
			}
		}
		return valor;
	}

}
