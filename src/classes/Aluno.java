package classes;

import java.util.Date;

public class Aluno extends Pessoa {
	
	private Double nota_final;

	public Aluno(String nome, int telefone, Date data_nascimento, Double nota_final) {
		super(nome, telefone, data_nascimento);
		this.nota_final = nota_final;
	}
	
	public Aluno(String nome, int telefone, String data_nascimento, Double nota_final) {
		super(nome, telefone, data_nascimento);
		this.nota_final = nota_final;
	}
	
	public void showData() {
		System.out.println(this.getNome()+"\t"+this.getTelefone()+"\t"+this.getData_nascimento()+"\t"
				+this.getData_cadastro()+"\t"+this.getData_alteracao()+"\t"+this.nota_final);
	}
	
	public Double getNota_final() {
		return nota_final;
	}
	public void setNota_final(Double nota_final) {
		this.nota_final = nota_final;
	}
	
	
}
