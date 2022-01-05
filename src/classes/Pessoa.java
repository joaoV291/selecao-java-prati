package classes;

import java.text.*;
import java.util.*;

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
	
	public Pessoa(String nome, int telefone, String data_nascimento) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.setData_nascimento(data_nascimento);
		this.data_cadastro = new Date();
		this.data_alteracao = new Date();
	}
	
	public void showData() {
		System.out.println(this.nome+"\t"+this.telefone+"\t"+this.data_nascimento+"\t"
				+this.data_cadastro+"\t"+this.data_alteracao);
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

	public void setData_nascimento(String data) {
		try {
            DateFormat fmt2 = new SimpleDateFormat("dd/MM/yyyy");
            Date dt = fmt2.parse(data);
            this.data_nascimento = dt;
        } catch(Exception e) {
            System.out.println("Formato de data invalido");
        }
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
