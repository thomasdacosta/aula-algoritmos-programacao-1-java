package edu.senac.aula06;

public class ContinuandoLaco {
	
	public static void main(String[] args) {
		int contando = 0;
		while (contando <= 20) {
			contando += 2;
			if (contando == 12)
				continue;
			
			System.out.println("Valor atual = " + contando);
		}
		System.out.println("Valor final " + contando);
	}

}
