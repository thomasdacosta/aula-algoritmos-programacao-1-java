package edu.senac.aula05;

public class OperadoresLogicos2 {

	public static void main(String[] args) {
		boolean p;
		boolean q;
		boolean r;
		p = true;
		q = false;
		r = true;

		if (((q && r) || (!p && r)) && r)
			System.out.println("Verdadeiro !!!\n");
		else
			System.out.println("Falso !!!\n");

		System.out.println("Resultado da expressão: " 
								+ (((q && r) || (!p && r)) && r));
	}

}
