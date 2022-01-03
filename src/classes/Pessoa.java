package classes;

import java.util.Date;

public class Pessoa {
	private String nome;
	private int telefone;
	private Date data_nascimento;
	private Date data_cadastro;
	private Date data_alteracao;
	
	public Pessoa(String nome, int telefone, Date data_nascimento) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.data_nascimento = data_nascimento;
		this.data_cadastro = new Date();
		this.data_alteracao = new Date();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public Date getData_cadastro() {
		return data_cadastro;
	}

	/*public void setData_cadastro() {
		this.data_cadastro = new Date();
	}*/

	public Date getData_alteracao() {
		return data_alteracao;
	}

	public void setData_alteracao() {
		this.data_alteracao = new Date();
	}
	
	
}
