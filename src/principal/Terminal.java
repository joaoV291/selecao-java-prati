package principal;

//import java.text.*;
import java.util.*;

import classes.Aluno;
import classes.Pessoa;

public class Terminal {
	
	public static void getAlunos(ArrayList<Aluno> list) {
		if(list.isEmpty()) {
			System.out.println("Alunos nao encontrados!");
		}else {
			System.out.println("Alunos");
			System.out.format("%-5s|", "Num.");
			System.out.format("%-25s|", "Nome");
			System.out.format("%-15s|", "Telefone");
			System.out.format("%-15s|", "Data Nasc.");
			System.out.format("%-12s|", "Nota Final");
			System.out.format("%-20s|", "Data Cadastro");
			System.out.format("%-20s%n", "Data Alteracao");
			for (Aluno i : list) {
				System.out.format("%-5d|", list.indexOf(i));
				i.showData();
			}
			System.out.print("\n");
		}
	}
	public static void getPessoas(ArrayList<Pessoa> list) {
		if(list.isEmpty()) {
			System.out.println("Pessoas nao encontradas!");
		}else {
			System.out.println("Pessoas");
			System.out.format("%-5s|", "Num.");
			System.out.format("%-25s|", "Nome");
			System.out.format("%-15s|", "Telefone");
			System.out.format("%-15s|", "Data Nasc.");
			System.out.format("%-20s|", "Data Cadastro");
			System.out.format("%-20s%n", "Data Alteracao");
			for (Pessoa i : list) {
				System.out.format("%-5d|", list.indexOf(i));
				i.showData();
			}
			System.out.print("\n");
		}
	}


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);  
		int choice = 5;
		ArrayList<Pessoa> p = new ArrayList<>();
		ArrayList<Aluno> a = new ArrayList<>();
		System.out.println("Projeto CRUD (Create, Read, Update, Delete)");  
		System.out.println("Pessoas e Alunos\n");  
		
		while(choice !=0) {
			System.out.println("Escolha um numero:\n 1-Create;\n 2-Read;\n 3-Update;\n 4-Delete;\n 0-SAIR\n");  
			try {
				choice=Integer.parseInt(sc.nextLine());
				if(choice==1) {
					String nm, tel, nasc;	//, not;
					double nota = 0.0d;
					//nome
					System.out.print("Nome:");  
					nm = sc.nextLine();
					//telefone
					System.out.print("Telefone (apenas números!):");  
					tel = sc.nextLine();
					//data nascimento
					System.out.print("Data de Nascimento (dd/MM/aaaa):");  
					nasc = sc.nextLine();
					//nota final do curso
					System.out.print("(OPCIONAL) Valor da nota (até 10.0):");  
					try {
						nota = Double.parseDouble(sc.nextLine());
					}catch(Exception e) {
						p.add(new Pessoa(nm, tel, nasc));
						System.out.println("Pessoa criada: "+p.get(p.size()).getNome());
						continue;
					}
					a.add(new Aluno(nm, tel, nasc, nota));
					System.out.println("Aluno criado: "+a.get(a.size()).getNome());
					
				} else if(choice==2) {	//Read
					if(p.isEmpty() && a.isEmpty()) {
						System.out.println("Ninguem foi encontrado!");
					} else {
						getPessoas(p);
						getAlunos(a);
					}
				} else if(choice>2&&choice<=4) {	//Update, Delete
					
					System.out.println("Digite 'true' para escolher um aluno (senao, vai escolher uma pessoa)");
					String l = sc.nextLine();
					
					if(Boolean.parseBoolean(l)) {
						if(a.isEmpty()) {
							System.out.println("Nenhum aluno encontrado!");
							continue;
						} else {
							getAlunos(a);
						}
					} else {
						if(p.isEmpty()) {
							System.out.println("Nenhuma pessoa encontrada!");
							continue;
						} else {
							getPessoas(p);
						}
					}
					System.out.println("Selecione um num da lista (ou nenhum num p voltar):");
					try {
						int j = Integer.parseInt(sc.nextLine());
					
						if(choice==4) {		//Delete
							System.out.println("Confirme com 'true' se quiser excluir!");
							String conf = sc.nextLine();
							if(Boolean.parseBoolean(conf)) {
								if(!Boolean.parseBoolean(l)) {
									String nm = p.get(j).getNome();
									p.remove(j);
									System.out.println("Pessoa "+nm+" removida");
								}else{
									String nm = a.get(j).getNome();
									a.remove(j);
									System.out.println("Aluno "+nm+" removido");
								}
							} else {
								continue;
							} 
						} else {	//Update
							int y=5;
							if(!Boolean.parseBoolean(l)) {
								Pessoa x=p.get(j);
								while(y!=0) {
									System.out.format("%-25s|", "Nome");
									System.out.format("%-15s|", "Telefone");
									System.out.format("%-15s|", "Data Nasc.");
									System.out.format("%-20s|", "Data Cadastro");
									System.out.format("%-20s%n", "Data Alteracao");
									x.showData();
									System.out.print("\n");
									System.out.println("Selecione:\n 1.Nome;\n 2.Telefone;\n 3.Data Nasc.;\n 0.VOLTAR\n");
									try {
										y = Integer.parseInt(sc.nextLine());
										if(y==1) {
											System.out.println("Novo nome:");
											x.setNome(sc.nextLine());
											x.setData_alteracao();
										} else if(y==2) {
											System.out.println("Novo telefone (apenas números!):");
											x.setTelefone(sc.nextLine());
											x.setData_alteracao();
										} else if(y==3) {
											System.out.println("Nova data nascimento('dd/mm/aaaa'):");
											x.setData_nascimento(sc.nextLine());
											x.setData_alteracao();
										} else if(y==0) {
											System.out.println("Voltando...!");
										} else {
											System.out.println("Entrada invalida!");
										}
									}catch(Exception e){
										System.out.println("Entrada invalida!");
									}
								}
							}else{
								Aluno x=a.get(j);
								while(y!=0) {
									System.out.format("%-25s|", "Nome");
									System.out.format("%-15s|", "Telefone");
									System.out.format("%-15s|", "Data Nasc.");
									System.out.format("%-12s|", "Nota Final");
									System.out.format("%-20s|", "Data Cadastro");
									System.out.format("%-20s%n", "Data Alteracao");
									x.showData();
									System.out.print("\n");
									System.out.println("Selecione:\n 1.Nome;\n 2.Telefone;\n 3.Data Nasc.;\n 4.Nota Final;\n 0.VOLTAR\n");
									try {
										y = Integer.parseInt(sc.nextLine());
										if(y==1) {
											System.out.println("Novo nome:");
											x.setNome(sc.nextLine());
											x.setData_alteracao();
										} else if(y==2) {
											System.out.println("Novo telefone (apenas números!):");
											x.setTelefone(sc.nextLine());
											x.setData_alteracao();
										} else if(y==3) {
											System.out.println("Nova data nascimento ('dd/mm/aaaa'):");
											x.setData_nascimento(sc.nextLine());
											x.setData_alteracao();
										} else if(y==4) {
											System.out.println("Nova nota final (até 10.0):");
											x.setNota_final(sc.nextLine());
											x.setData_alteracao();
										} else if(y==0) {
											System.out.println("Voltando...!");
										} else {
											System.out.println("Entrada invalida!");
										}
									}catch(Exception e){
										System.out.println("Entrada invalida!");
									}
								}
							}
						}
					} catch(Exception e) {
						System.out.println("Voltando...");
						continue;
					}
				} else if(choice==0) {
					System.out.println("Saindo...");
				} else {
					System.out.println("Entrada invalida!!!");
				}
			}catch(Exception e) {
				System.out.println("Entrada invalida!!!");
			}
		}
		sc.close();
	}

}
