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
	
	public Pessoa(String nome, String telefone, String data_nascimento) {
		super();
		this.nome = nome;
		this.setTelefone(telefone);
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

	public void setTelefone(String telefone) {
		try {
			this.telefone = Integer.parseInt(telefone);
		}catch(Exception e) {
            System.out.println("Telefone invalido! Corrija mais tarde");
            this.telefone=00000000;
		}
	}

	/*public Date getData_nascimento() {
        return data_nascimento;
	}*/

	public String getData_nascimento() {
		DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        return fmt.format(data_nascimento);
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public void setData_nascimento(String data) {
		try {
            DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            Date dt = fmt.parse(data);
            this.data_nascimento = dt;
        } catch(Exception e) {
            System.out.println("Formato de data invalido");
            //this.data_nascimento = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/1950");
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
