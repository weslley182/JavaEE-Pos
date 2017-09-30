package br.com.rp.repository.impl;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import br.com.rp.domain.Log;
import br.com.rp.domain.Pessoa;
import br.com.rp.repository.PessoaRepository;

@Stateless
public class PessoaRepositoryImpl extends AbstractRepositoryImpl<Log> implements PessoaRepository {

	public PessoaRepositoryImpl() {
		super(Log.class);
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void save(Pessoa pessoa) {
		return super.save(pessoa);
	}
}
