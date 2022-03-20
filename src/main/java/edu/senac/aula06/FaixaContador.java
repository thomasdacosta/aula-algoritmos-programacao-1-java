package edu.senac.aula06;

import java.util.Scanner;

public class FaixaContador {
	
	public static void main(String[] args) {
		int i;
		int inicio, fim;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número inicial:");
		inicio = scanner.nextInt();
		
		System.out.println("Digite um número final:");
		fim = scanner.nextInt();
		
		scanner.close();
		for (i=inicio;i<=fim;i++) {
			System.out.println("Contando " + i);
		}
	}

}
