package principal;

//import java.text.*;
import java.util.*;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.Scanner;

import classes.Aluno;
import classes.Pessoa;

public class Terminal {
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		int choice = 0;
		ArrayList<Pessoa> p = new ArrayList<>();
		ArrayList<Aluno> a = new ArrayList<>();
		
		while(choice !=5) {
			System.out.print("Enter number- 1-create, 2-read, 3-update, 4-delete, 5-exit");  
			choice=sc.nextInt();

			switch (choice) {
				case 1:	//Create - 1
					//nome
					System.out.print("Enter name");  
					String nm = sc.nextLine();
					//telefone
					System.out.print("Enter telephone");  
					int tel = sc.nextInt();
					//data nascimento
					System.out.print("Enter birthdate (dd/MM/aaaa)");  
					String nasc = sc.nextLine();
					
					//nota final do curso
					System.out.print("nota final? (true/false)");  
					boolean al = sc.nextBoolean();
					if(al) {
						System.out.print("Enter final note");  
						Double not = sc.nextDouble();
						a.add(new Aluno(nm, tel, nasc, not));
					}else {
						p.add(new Pessoa(nm,tel,nasc));
					}
					break;
				case 2:	//Read - 2
					//Systemy.searchClient();
					if(p.isEmpty() && a.isEmpty()) {
						System.out.println("No data found!");
					}else {
						if(p.isEmpty()) {
							System.out.println("People not found!");
						}else {
							for (Pessoa i : p) {
								System.out.println("No\tName\tTelefone\tNasc\tCadastro\tAlteracao");
								System.out.print(p.indexOf(i)+"\t");
								i.showData();
							}
						}
						if(a.isEmpty()) {
							System.out.println("Alumn not found!");
						}else {
							for (Aluno i : a) {
								System.out.println("No\tName\tTelefone\tNasc\tCadastro\tAlteracao\tNotafinal");
								System.out.print(a.indexOf(i)+"\t");
								i.showData();
							}
						}
					}
					break;
				case 3:	//Update - 3
					//data ultima alteracao
					System.out.println("select (p/a)");
					char l = sc.nextLine().charAt(0);
					
					System.out.println("select from index list");
					int j = sc.nextInt();
					if(l=='p') {
						Pessoa k = p.get(j);
						int x = 0;
						while(x!=4) {
							k.showData();
							System.out.println("select (1.name, 2.telephone, 3.dataNasc, 4.exit):");
							x = sc.nextInt();
							System.out.println("novos dados:");
							String s = sc.nextLine();
							if(x==1) {
								k.setNome(s);
							}else if(x==2) {
								k.setTelefone(Integer.parseInt(s));
							}else if(x==3) {
								k.setData_nascimento(s);
							}
							
						}
						k.setData_alteracao();
					}else if (l=='a') {
						Aluno k = a.get(j);
						int x = 0;
						while(x!=5) {
							k.showData();
							System.out.println("select (1.name, 2.telephone, 3.dataNasc, 4.notaFinal, 5.exit):");
							x = sc.nextInt();
							System.out.println("novos dados:");
							String s = sc.nextLine();
							if(x==1) {
								k.setNome(s);
							}else if(x==2) {
								k.setTelefone(Integer.parseInt(s));
							}else if(x==3) {
								k.setData_nascimento(s);
							}else if(x==4) {
								k.setNota_final(Double.parseDouble(s));
							}
							
						}
						k.setData_alteracao();
					}else {
						System.out.println("Invalid data!");
					}
					//Systemy.extendLimit();
					break;
				case 4:	//Delete - 4
					//Systemy.extendLimit();
					System.out.println("select (p/a)");
					l = sc.nextLine().charAt(0);
					
					System.out.println("select from index list");
					j = sc.nextInt();
					if(l=='p') {
						p.remove(j);
					}else if(l=='a') {
						a.remove(j);
					}

					break;
				default:
					System.out.println("Invalid!!!");
			}
			
			
		}
		sc.close();
	}

}
