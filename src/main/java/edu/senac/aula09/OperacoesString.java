package edu.senac.aula09;

public class OperacoesString {
	
	public static void main(String[] args) {
		String nome = "Bruce";
		String sobreNome = "Wayne";
		String nomeCompleto;
		
		// UpperCase
		System.out.println(nome.toUpperCase() + " " + sobreNome.toUpperCase());

		// LowerCase
		System.out.println(nome.toLowerCase() + " " + sobreNome.toLowerCase());

		// Concatenação
		System.out.println(nome.concat(" " + sobreNome));

		nomeCompleto = nome.concat(" " + sobreNome);

		// Tamanho da String
		System.out.println(nomeCompleto.length());

		// String em branco
		System.out.println(nomeCompleto.isBlank());

		// String vazia
		System.out.println(nomeCompleto.isEmpty());

		// Separando uma String
		String separado[] = nomeCompleto.split(" ");
		System.out.println(separado.length);

		for (int i = 0; i <= separado.length - 1; i++) {
			System.out.println(separado[i]);
		}

		System.out.println(nomeCompleto.substring(6));

	}

}
