package edu.senac.aula05;

import java.util.Scanner;

public class CalculoNota {

	public static void main(String[] args) {
		double notaB1;
		double notaB2;
		double media;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a nota da B1:");
		notaB1 = scanner.nextDouble();
		
		System.out.println("Digite a nota da B2:");
		notaB2 = scanner.nextDouble();
		
		media = ((notaB1 * 0.4) + (notaB2 * 0.6));
		
		if (media >= 6) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		
		scanner.close();
	}

}
