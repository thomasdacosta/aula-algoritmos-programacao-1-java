package edu.senac.aula04;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		boolean p;
		boolean q;
		boolean S;
		
		p = false;
		q = true;
		
		S = p && q;
		System.out.println("Conjunção (AND ou E):" + S);
		
		S = p || q;
		System.out.println("Disjunção (OR ou OU):" + S);
		System.out.println("Negação (NOT ou NÃO):" + !p);
	}

}
