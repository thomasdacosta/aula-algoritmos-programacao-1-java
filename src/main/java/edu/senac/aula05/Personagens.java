package edu.senac.aula05;

public class Personagens {

	public static void main(String[] args) {
		String identidadeSecretaBatman = "Bruce Wayne";
		String identidadeSecretaSuperMan = new String("Clark Kent");

		if (!identidadeSecretaBatman.equals(identidadeSecretaSuperMan)) {
			System.out.println("Os nomes são diferentes.");
		} else {
			System.out.println("Os nomes são iguais.");
		}
	}

}
