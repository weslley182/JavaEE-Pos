package br.com.rp.services;

import java.util.List;
import java.util.concurrent.Future;

import javax.ejb.AsyncResult;
import javax.ejb.Asynchronous;
import javax.ejb.Stateless;

@Stateless
@Asynchronous
public class CalculadoraServiceAssinc {
	
	public Future<Integer> calcularSomaAssinc(List<Integer> lista){
		int valor = 0;		
		for (int i= 0; i<lista.size(); i++){   
			valor = valor + lista.get(i);  
	    }
		return new AsyncResult<Integer>(valor);
	}	
	
	
	public Future<Integer> calcularMediaAssinc(List<Integer> lista){
		int valor = 0;
		for (int i= 0; i<lista.size(); i++){   
			valor = valor + lista.get(i);			
	    }		
		int result = valor / lista.size();		
		return new AsyncResult<Integer>(result);
	}
	
	
}
