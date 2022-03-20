package edu.senac.aula04;

public class SaidaConsole {

	public static void main(String[] args) {
		System.out.println("Imprimindo na saida do console");
		System.err.println("Imprimindo na saida de erro do console");
		System.out.print("Está forma não pula linha");
		System.err.format("Saida %s formatada\n", new String("é"));
		System.out.format("Esta %s também é formatada\n", new String("saida"));

		System.out.format("%s formatada %s vários %s", 
				new String("Saida"), 
				new String("com"),
				new String("paramêtros"));
	}

}
