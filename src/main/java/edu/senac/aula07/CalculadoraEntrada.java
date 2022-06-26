package edu.senac.aula07;

import java.util.Scanner;

public class CalculadoraEntrada {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor para somar:");
		double soma1 = scanner.nextInt();
		
		System.out.println("Digite o segundo valor para somar:");
		double soma2 = scanner.nextDouble();
		
		double resultado = somar(soma1, soma2);
		System.out.println("Resultado da Soma: " + resultado);
		scanner.close();
	}
	
	public static double somar(double x, double y) {
		double resultado = x  + y;
		return resultado;
	}	

}
