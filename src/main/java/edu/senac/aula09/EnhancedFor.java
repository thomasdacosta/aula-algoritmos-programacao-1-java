package edu.senac.aula09;

public class EnhancedFor {

	public static void main(String[] args) {
		String linhas[] = { 
				"Brunce Wayne;32;Wayne Corporation;Dono", 
				"Lucius Fox;60;Wayne Corporation;CEO",
				"Dick Grayson;25;BatCaverna;Ajudante" 
		};
		
		// Mostrando dados
		for (String linha : linhas) {
			String valores[] = linha.split(";");
			System.out.println("Nome: " + valores[0] 
					+ " --- Idade: " + valores[1] 
					+ " --- Empresa: " + valores[2] 
					+ " --- Cargo: " + valores[3]);
		}
	}

}
