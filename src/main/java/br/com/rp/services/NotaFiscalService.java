package br.com.rp.services;

import javax.ejb.Stateless;
import javax.jms.Message;
import javax.jms.MessageListener;

import br.com.rp.domain.NotaFiscal;

@Stateless
public class NotaFiscalService implements MessageListener {

	public void imprimirNota(NotaFiscal nota){
		System.out.println("Nota fiscal impressa: " + nota.getNumero());
	}

	@Override
	public void onMessage(Message arg0) {
		// TODO Auto-generated method stub
		
	}
}
