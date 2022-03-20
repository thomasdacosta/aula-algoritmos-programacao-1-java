package edu.senac.aula05;

public class Condicoes {
	
	public static void main(String[] args) {
		boolean ligar = true;
		if (ligar)
			System.out.println("Ligado");
		
		if (!ligar)
			System.out.println("Desligado");
		
		float soma;
		float operador1 = 788.00f;
		float operador2 = 3.58f;
		
		soma = operador1 + operador2;
		if (soma == 791.58f) {
			System.out.println("Resultado da soma é " + soma);
		}
	}

}
