package edu.senac.aula06;

public class InterromperLaco {
	
	public static void main(String[] args) {
		for (int i=0;i<= 150;i++) {
			System.out.println("Contando " + i);
			if (i == 42) {
				System.out.println("42 é a resposta para tudo!!!");
				break;
			}
		}
	}

}
