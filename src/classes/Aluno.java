package classes;

import java.util.Date;

public class Aluno extends Pessoa {
	
	private Double nota_final;

	public Aluno(String nome, int telefone, Date data_nascimento, Double nota_final) {
		super(nome, telefone, data_nascimento);
		this.nota_final = nota_final;
	}
	
	
	public Double getNota_final() {
		return nota_final;
	}
	public void setNota_final(Double nota_final) {
		this.nota_final = nota_final;
	}
	
	
}
