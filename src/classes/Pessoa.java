package classes;

import java.text.*;
import java.util.*;

public class Pessoa {
	private String nome;
	private int telefone = 0;
	private Date data_nascimento;	// = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/1950");
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
	
	public Pessoa(String nome, String telefone, String data_nascimento) {
		super();
		this.nome = nome;
		this.setTelefone(telefone);
		this.setData_nascimento(data_nascimento);
		this.data_cadastro = new Date();
		this.data_alteracao = new Date();
	}
	
	public void showData() {
		System.out.format("%-25s|",this.nome);
		System.out.format("%-15d|",this.telefone);
		System.out.format("%-15s|",this.getData_nascimento());
		System.out.format("%-20s|",DateFormat.getInstance().format(this.data_cadastro));
		System.out.format("%-20s%n",DateFormat.getInstance().format(this.data_alteracao));
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

	public void setTelefone(String telefone) {
		try {
			this.telefone = Integer.parseInt(telefone);
		}catch(Exception e) {
            System.out.println("Telefone invalido!");
		}
	}


	public String getData_nascimento() {
		try {
			DateFormat fmt = SimpleDateFormat.getDateInstance(DateFormat.SHORT);
			return fmt.format(this.data_nascimento);
		}catch(Exception e) {
			return "Data Invalida!";
		}
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public void setData_nascimento(String data) {
		try {
			SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
			Date dt = fmt.parse(data);
			this.data_nascimento = dt;
		} catch(Exception e) {
			System.out.println("Formato de data invalido");
		}
	}

	public Date getData_cadastro() {
		return data_cadastro;
	}

	public Date getData_alteracao() {
		return data_alteracao;
	}

	public void setData_alteracao() {
		this.data_alteracao = new Date();
	}
	
}
