package edu.senac.aula04;

public class Operadores {
	
	public static void main(String[] args) {
		double operador1 = 1;
		double operador2 = 2;
		
		System.out.println("Soma:" + (operador1 + operador2));
		System.out.println("Subtra��o:" + (operador1 - operador2));
		System.out.println("Multiplica��o:" + (operador1 * operador2));
		System.out.println("Divis�o:" + (operador1 / operador2));
		System.out.println("Resto da Divis�o:" + (operador1 % operador2));
		
		System.out.println("Incremento:" + operador1++);
		System.out.println("Decremento:" + operador1--);
		
		operador1 += 10;
		operador2 -= 10;
		
		System.out.println(operador1);
		System.out.println(operador2);
	}

}
