package edu.senac.aula04;

public class Operadores {
	
	public static void main(String[] args) {
		double operador1 = 1;
		double operador2 = 2;
		
		System.out.println("Soma:" + (operador1 + operador2));
		System.out.println("Subtração:" + (operador1 - operador2));
		System.out.println("Multiplicação:" + (operador1 * operador2));
		System.out.println("Divisão:" + (operador1 / operador2));
		System.out.println("Resto da Divisão:" + (operador1 % operador2));
		
		System.out.println("Incremento:" + operador1++);
		System.out.println("Decremento:" + operador1--);
		
		operador1 += 10;
		operador2 -= 10;
		
		System.out.println(operador1);
		System.out.println(operador2);
	}

}
