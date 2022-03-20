package edu.senac.aula05;

public class SwitchPersonagem {
	
	public static void main(String[] args) {
		String nome = "batman";
		
		switch (nome) {
			case "batman":
			case "superman":
				System.out.println("DC Comics");
				break;
			case "ironman":
				System.out.println("Marvel");
				break;
			default:
				System.out.println("Não achei a empresa");
				break;
		}
	}

}
