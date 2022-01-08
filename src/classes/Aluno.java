package classes;

import java.util.*;

public class Aluno extends Pessoa {
	
	private double nota_final = 0.0d;

	public Aluno(String nome, int telefone, Date data_nascimento, double nota_final) {
		super(nome, telefone, data_nascimento);
		this.nota_final = nota_final;
	}
	
	public Aluno(String nome, String telefone, String data_nascimento, String nota_final) {
		super(nome, telefone, data_nascimento);
		this.setNota_final(nota_final);
	}
	
	public void showData() {
		System.out.println(this.getNome()+"\t"+this.getTelefone()+"\t"+this.getData_nascimento()+this.nota_final+"\t"
				+this.getData_cadastro()+"\t"+this.getData_alteracao()+"\t");
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
