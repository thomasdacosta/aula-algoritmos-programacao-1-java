package edu.senac.aula05;

public class OperadoresLogicos1 {
	
	public static void main(String[] args) {
		boolean p;
		boolean q;
		boolean r;
		p = true;
		q = false;
		r = true;

		if (q && r)
			System.out.println("Verdadeiro !!!\n");
		else
			System.out.println("Falso !!!\n");
		
		if (p || q)
			System.out.println("Verdadeiro !!!\n");
		
		if (!q)
			System.out.println("Verdadeiro !!!\n");
	}

}
