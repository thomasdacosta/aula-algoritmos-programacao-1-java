package edu.senac.aula04;

public class VariaveisString {

	public static void main(String[] args) {
		String nome = "Bruce Wayne";

		System.out.println(nome.toUpperCase());
		System.out.println(nome.toLowerCase());
		System.out.println(nome.equals("Bruce"));
		System.out.println(nome.equals("Bruce Wayne"));
		System.out.println(nome.isEmpty());
		System.out.println(nome.isBlank());
		System.out.println(nome.concat(" é o Batman"));
		System.out.println(nome.substring(0, 5));
	}

}
