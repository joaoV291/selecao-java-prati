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
			System.out.println("No\tName\tTelefone\tData Nascimento\tNota Final\tData Cadastro\tData Alteracao");
			for (Aluno i : list) {
				System.out.print(list.indexOf(i)+"\t");
				i.showData();
			}
		}
	}
	public static void getPessoas(ArrayList<Pessoa> list) {
		if(list.isEmpty()) {
			System.out.println("Pessoas nao encontradas!");
		}else {
			System.out.println("Pessoas");
			System.out.println("No\tName\tTelefone\tData Nascimento\tData Cadastro\tData Alteracao");
			for (Pessoa i : list) {
				System.out.print(list.indexOf(i)+"\t");
				i.showData();
			}
		}
	}


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);  
		int choice = 5;
		ArrayList<Pessoa> p = new ArrayList<>();
		ArrayList<Aluno> a = new ArrayList<>();
		
		while(choice !=0) {
			System.out.println("Enter number:\n 1-create;\n 2-read;\n 3-update;\n 4-delete;\n 0-exit\n");  
			try {
				choice=Integer.parseInt(sc.nextLine());
				if(choice==1) {
					String nm, tel, nasc, not;
					//nome
					System.out.print("Nome:");  
					nm = sc.nextLine();
					//telefone
					System.out.print("Telefone:");  
					tel = sc.nextLine();
					//data nascimento
					System.out.print("Data de Nascimento (dd/MM/aaaa):");  
					nasc = sc.nextLine();
					//nota final do curso
					System.out.print("Digite 'true' se quiser uma nota final:");  
					String al = sc.nextLine();
					if(Boolean.parseBoolean(al)) {
						System.out.print("Valor da nota:");  
						not = sc.nextLine();
						a.add(new Aluno(nm, tel, nasc, not));
						System.out.println("Aluno criado!"+a.get(a.size()).getNome());
					} else {
						p.add(new Pessoa(nm, tel, nasc));
						System.out.println("Pessoa criada!"+p.get(a.size()).getNome());
					}
					
				} else if(choice==2) {	//Read
					if(p.isEmpty() && a.isEmpty()) {
						System.out.println("No data found!");
					} else {
						getPessoas(p);
						getAlunos(a);
					}
				} else if(choice>2&&choice<=4) {	//Update, Delete
					
					System.out.println("Digite 'true' para escolher um aluno (senao, vai escolher uma pessoa)");
					String l = sc.nextLine();
					
					if(Boolean.parseBoolean(l)) {
						if(a.isEmpty()) {
							System.out.println("No students found!");
							continue;
						} else {
							getAlunos(a);
						}
					}else {
						if(p.isEmpty()) {
							System.out.println("No people found!");
							continue;
						} else {
							getPessoas(p);
						}
					}
					System.out.println("Selecione um num da lista (ou nenhum num p voltar):");
					try {
						int j = Integer.parseInt(sc.nextLine());
					
						if(choice==4) {		//Delete
							if(!Boolean.parseBoolean(l)) {
								String nm = p.get(j).getNome();
								p.remove(j);
								System.out.println("Pessoa "+nm+" removida");
							}else{
								String nm = a.get(j).getNome();
								a.remove(j);
								System.out.println("Aluno "+nm+" removido");
							}
						} else {	//Update
							int y=5;
							if(!Boolean.parseBoolean(l)) {
								Pessoa x=p.get(j);
								while(y!=0) {
									x.showData();
									System.out.println("select:\n 1.name;\n 2.telephone;\n 3.dataNasc;\n 0.exit\n");
									try {
										y = Integer.parseInt(sc.nextLine());
										if(y==1) {
											System.out.println("novo nome:");
											x.setNome(sc.nextLine());
											x.setData_alteracao();
										} else if(y==2) {
											System.out.println("novo telefone:");
											x.setTelefone(sc.nextLine());
											x.setData_alteracao();
										} else if(y==3) {
											System.out.println("nova data nascimento('dd/mm/aaaa'):");
											x.setData_nascimento(sc.nextLine());
											x.setData_alteracao();
										} else if(y==0) {
											System.out.println("Voltando atras...!");
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
									x.showData();
									System.out.println("select:\n 1.name;\n 2.telephone;\n 3.dataNasc;\n 4.notaFinal;\n 0.exit\n");
									try {
										y = Integer.parseInt(sc.nextLine());
										if(y==1) {
											System.out.println("novo nome:");
											x.setNome(sc.nextLine());
											x.setData_alteracao();
										} else if(y==2) {
											System.out.println("novo telefone:");
											x.setTelefone(sc.nextLine());
											x.setData_alteracao();
										} else if(y==3) {
											System.out.println("nova data nascimento('dd/mm/aaaa'):");
											x.setData_nascimento(sc.nextLine());
											x.setData_alteracao();
										} else if(y==4) {
											System.out.println("nova nota final:");
											x.setNota_final(sc.nextLine());
											x.setData_alteracao();
										} else if(y==0) {
											System.out.println("Voltando atras...!");
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
