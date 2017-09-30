package br.com.rp.repository.impl;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import br.com.rp.domain.Pessoa;
import br.com.rp.repository.PessoaRepository;

@Stateless
public class PessoaRepositoryImpl extends AbstractRepositoryImpl<Pessoa> implements PessoaRepository {

	public PessoaRepositoryImpl() {
		super(Pessoa.class);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public Pessoa save(Pessoa object) {
		
		if (!object.validarMaiorDeIdade()){
			throw new IllegalArgumentException(); 
		}
		return super.save(object);
	}
	
}
