package edu.senac.aula05;

import java.util.Scanner;

public class FaixaNumero {
	
	public static void main(String[] args) {
		int numero;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um n�mero entre 0 e 10:");
		numero = scanner.nextInt();
		
		if (numero >=0 && numero <= 10)
		{
			System.out.println("N�mero v�lido !!!\n");
			System.out.println("N�mero digitado: " + numero);
		}
		else
			System.out.println("N�mero inv�lido !!!\n");
		
		scanner.close();
	}

}
