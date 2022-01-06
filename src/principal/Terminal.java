package principal;

//import java.text.*;
import java.util.*;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.Scanner;

import classes.Aluno;
import classes.Pessoa;

public class Terminal {
	
	public static void getAlunos(ArrayList<Aluno> list) {
		if(list.isEmpty()) {
			System.out.println("Alumn not found!");
		}else {
			for (Aluno i : list) {
				System.out.println("No\tName\tTelefone\tNasc\tCadastro\tAlteracao\tNotafinal");
				System.out.print(list.indexOf(i)+"\t");
				i.showData();
			}
		}
	}
	public static void getPessoas(ArrayList<Pessoa> list) {
		if(list.isEmpty()) {
			System.out.println("People not found!");
		}else {
			for (Pessoa i : list) {
				System.out.println("No\tName\tTelefone\tNasc\tCadastro\tAlteracao");
				System.out.print(list.indexOf(i)+"\t");
				i.showData();
			}
		}
	}


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		int choice = 5;
		ArrayList<Pessoa> p = new ArrayList<>();
		ArrayList<Aluno> a = new ArrayList<>();
		
		while(choice !=0) {
			System.out.print("Enter number:\n 1-create;\n 2-read;\n 3-update;\n 4-delete;\n 0-exit");  
			choice=sc.nextInt();

			if(choice==1) {
				System.out.print("Enter name");  
				String nm = sc.nextLine();
				//telefone
				System.out.print("Enter telephone");  
				int tel = sc.nextInt();
				//data nascimento
				System.out.print("Enter birthdate (dd/MM/aaaa)");  
				String nasc = sc.nextLine();
				
				//nota final do curso
				System.out.print("nota final? (1=sim/0=nao)");  
				boolean al = sc.nextBoolean();
				if(al) {
					System.out.print("Enter final note");  
					Double not = sc.nextDouble();
					a.add(new Aluno(nm, tel, nasc, not));
					System.out.println("Aluno criado!"+a.get(a.size()).getNome());
				} else {
					p.add(new Pessoa(nm,tel,nasc));
					System.out.println("Pessoa criada!"+p.get(a.size()).getNome());
				}
			} else if(choice==2||choice==3||choice==4) {
				if(p.isEmpty() && a.isEmpty()) {
					System.out.println("No data found!");
				} else {
					getPessoas(p);
					getAlunos(a);
				}
				
				if(choice==3||choice==4) {
					//while(l!='p'||l!='a') {
					//ArrayList<> x;
					System.out.println("select\n 0.pessoa\n 1.aluno");
					boolean l = sc.nextBoolean();
					//}
					System.out.println("select from index list");
					int j = sc.nextInt();
					if(choice==4) {
						if(l) {
							String nm = p.get(j).getNome();
							p.remove(j);
							System.out.println("Pessoa "+nm+" removida");
						}else{
							String nm = a.get(j).getNome();
							a.remove(j);
							System.out.println("Aluno "+nm+" removido");
						}
					} else {
						int y=5;
						if(l) {
							Pessoa x=p.get(j);
							while(y!=0) {
								x.showData();
								System.out.println("select:\n 1.name;\n 2.telephone;\n 3.dataNasc;\n 0.exit");
								y = sc.nextInt();
								switch (y) {
								case 1:
									System.out.println("novo nome:");
									x.setNome(sc.nextLine());
									break;
								case 2:
									System.out.println("novo telefone:");
									x.setTelefone(sc.nextInt());
									break;
								case 3:
									System.out.println("nova data nascimento('dd/mm/aaaa'):");
									x.setData_nascimento(sc.nextLine());
									break;
								//default:
								}
								x.setData_alteracao();
							}
						}else{
							Aluno x=a.get(j);
							while(y!=0) {
								x.showData();
								System.out.println("select:\n 1.name;\n 2.telephone;\n 3.dataNasc;\n 4.notaFinal;\n 0.exit");
								y = sc.nextInt();
								switch (y) {
								case 1:
									System.out.println("novo nome:");
									x.setNome(sc.nextLine());
									break;
								case 2:
									System.out.println("novo telefone:");
									x.setTelefone(sc.nextInt());
									break;
								case 3:
									System.out.println("nova data nascimento('dd/mm/aaaa'):");
									x.setData_nascimento(sc.nextLine());
									break;
								case 4:
									System.out.println("nova nota final:");
									x.setNota_final(sc.nextDouble());
									break;
								//default:
								}
								x.setData_alteracao();
							}
						}
					}
				}
			} else {
				System.out.println("Invalid!!!");
			}
		}
		sc.close();
	}

}
