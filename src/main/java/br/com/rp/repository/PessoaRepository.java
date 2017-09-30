package br.com.rp.repository;

import javax.ejb.Local;

import br.com.rp.domain.Pessoa;

@Local
public interface PessoaRepository extends Repository<Pessoa>{

}
