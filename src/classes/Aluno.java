package classes;

import java.text.DateFormat;
import java.util.*;

public class Aluno extends Pessoa {
	
	private double nota_final = 0.0d;

	public Aluno(String nome, int telefone, Date data_nascimento, double nota_final) {
		super(nome, telefone, data_nascimento);
		this.setNota_final(nota_final);
	}
	
	public Aluno(String nome, String telefone, String data_nascimento, double nota_final) {
		super(nome, telefone, data_nascimento);
		this.setNota_final(nota_final);
	}
	
	public Aluno(String nome, String telefone, String data_nascimento, String nota_final) {
		super(nome, telefone, data_nascimento);
		this.setNota_final(nota_final);
	}
	
	public void showData() {
		System.out.format("%-25s|",this.getNome());
		System.out.format("%-15d|",this.getTelefone());
		System.out.format("%-15s|",this.getData_nascimento());
		System.out.format("%-12.2f|",this.nota_final);
		System.out.format("%-20s|",DateFormat.getInstance().format(this.getData_cadastro()));
		System.out.format("%-20s%n",DateFormat.getInstance().format(this.getData_alteracao()));
	}
	
	public double getNota_final() {
		return nota_final;
	}
	public void setNota_final(double nota_final) {
		if(nota_final>=0&&nota_final<=10)
			this.nota_final = nota_final;
		else
			System.out.println("Nota invalida!");
	}
	
	public void setNota_final(String nota) {
		if(nota_final>=0&&nota_final<=10) {
			try {
				this.nota_final = Double.parseDouble(nota);
			}catch(Exception e) {
				System.out.println("Nota invalida!");
			}
		} else {
			System.out.println("Nota invalida!");
		}
	}
	
}
