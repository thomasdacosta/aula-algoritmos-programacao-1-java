package edu.senac.aula05;

import java.util.Scanner;

public class FaixaNumero {
	
	public static void main(String[] args) {
		int numero;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número entre 0 e 10:");
		numero = scanner.nextInt();
		
		if (numero >=0 && numero <= 10) {
			System.out.println("Número válido !!!\n");
			System.out.println("Número digitado: " + numero);
		}
		else
			System.out.println("Número inválido !!!\n");
		
		scanner.close();
	}

}
