package edu.senac.aula05;

import java.util.Scanner;

public class Menu2 {
	
	public static void main(String[] args) {
		int opcaoMenu;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma op��o");
		System.out.println("1 - Incluir aluno");
		System.out.println("2 - Listar aluno");
		System.out.println("3 - Sair");

		opcaoMenu = scanner.nextInt();

		switch (opcaoMenu) {
			case 1:
				System.out.println("Op��o de incluir aluno selecionado");
				break;
			case 2:
				System.out.println("Op��o de listar aluno selecionado");
				break;
			case 3:
				System.out.println("Saindo !!!");
				break;
			default:
				System.out.println("Op��o inv�lida !!!");
				break;
		}
		
		scanner.close();
	}

}
