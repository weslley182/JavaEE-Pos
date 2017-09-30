package br.com.rp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "vbn_Pessoa")
public class Pessoa extends BaseEntity{
	
	@Column(name = "idade_pessoa")
	private int idade;	

	@Column(name = "nome_pessoa")
	private String nome;
	
	@Column(name = "cpf_pessoa", unique = true)
	private String cpf;
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + "]";
	}
	
	public boolean validarMaiorDeIdade(){
		return this.idade > 18;
	}
	
	

}
