package edu.senac.aula06;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		int i;
		int inicio, fim;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número inicial:");
		inicio = scanner.nextInt();

		System.out.println("Digite um número final:");
		fim = scanner.nextInt();

		scanner.close();
		for (i = inicio; i <= fim; i++) {
			if ((i % 2) == 0)
				System.out.println("Par = " + i);
			else
				System.out.println("Impar = " + i);
		}
	}

}
