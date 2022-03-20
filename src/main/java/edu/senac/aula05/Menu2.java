package edu.senac.aula05;

import java.util.Scanner;

public class Menu2 {
	
	public static void main(String[] args) {
		int opcaoMenu;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma opção");
		System.out.println("1 - Incluir aluno");
		System.out.println("2 - Listar aluno");
		System.out.println("3 - Sair");

		opcaoMenu = scanner.nextInt();

		switch (opcaoMenu) {
			case 1:
				System.out.println("Opção de incluir aluno selecionado");
				break;
			case 2:
				System.out.println("Opção de listar aluno selecionado");
				break;
			case 3:
				System.out.println("Saindo !!!");
				break;
			default:
				System.out.println("Opção inválida !!!");
				break;
		}
		
		scanner.close();
	}

}
