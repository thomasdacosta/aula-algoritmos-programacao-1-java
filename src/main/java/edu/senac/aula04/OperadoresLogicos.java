package edu.senac.aula04;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		boolean p;
		boolean q;
		boolean S;
		
		p = false;
		q = true;
		
		S = p && q;
		System.out.println("Conjun��o (AND ou E):" + S);
		
		S = p || q;
		System.out.println("Disjun��o (OR ou OU):" + S);
		System.out.println("Nega��o (NOT ou N�O):" + !p);
	}

}
