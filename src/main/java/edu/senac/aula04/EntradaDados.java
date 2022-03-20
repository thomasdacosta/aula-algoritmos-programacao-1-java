package edu.senac.aula04;

import java.util.Scanner;

public class EntradaDados {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a sua idade:");
		int idade = scanner.nextInt();
		
		System.out.println(String.format("Sua idade é %s anos", idade));
		scanner.close();
	}

}
