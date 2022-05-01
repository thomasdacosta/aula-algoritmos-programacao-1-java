package edu.senac.aula09;

import java.util.Scanner;

public class TratamentoErro {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int dividendo;
			int divisor;
			int resultado;
			
			System.out.println("Digite o dividendo:");
			dividendo = scanner.nextInt();
			
			System.out.println("Digite o divisor:");
			divisor = scanner.nextInt();			
			
			resultado = dividendo / divisor;
			
			System.out.println("Resultado:" + resultado);
		} catch (Exception ex) {
			ex.printStackTrace(System.out);
		} finally {
			scanner.close();
		}
	}

}
