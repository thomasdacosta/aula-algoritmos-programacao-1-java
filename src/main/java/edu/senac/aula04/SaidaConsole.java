package edu.senac.aula04;

public class SaidaConsole {

	public static void main(String[] args) {
		System.out.println("Imprimindo na saida do console");
		System.err.println("Imprimindo na saida de erro do console");
		System.out.print("Est� forma n�o pula linha");
		System.err.format("Saida %s formatada\n", new String("�"));
		System.out.format("Esta %s tamb�m � formatada\n", new String("saida"));

		System.out.format("%s formatada %s v�rios %s", 
				new String("Saida"), 
				new String("com"),
				new String("param�tros"));
	}

}
