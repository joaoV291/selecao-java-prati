package principal;

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
			//choice = InOut.setInt("1-create, 2-read, 3-update, 4-delete, 5-exit");
			switch (choice) {
				case 1:	//Create - 1
					//nome
					System.out.print("Enter name");  
					String nm = sc.nextLine();
					//telefone
					System.out.print("Enter telephone");  
					int tel = sc.nextInt();
					//data nascimento
					System.out.print("Enter birthdate");  
					Date nasc = (Date) sc.nextLine();
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
					break;
				case 3:	//Update - 3
					//data ultima alteracao
					//Systemy.extendLimit();
					break;
				case 4:	//Delete - 4
					//Systemy.extendLimit();
					break;
				default:
					System.out.println("Invalid!!!");
			}
			
			
		}

	}

}
