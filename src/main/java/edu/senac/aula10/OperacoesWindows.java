package edu.senac.aula10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OperacoesWindows {

	public static void limparTela() {
		try {
			new ProcessBuilder("cmd", "/c", "cls")
				.inheritIO()
				.start().waitFor();
		} catch (Exception ex) {
			ex.printStackTrace();
		}	
	}
	
	public static void commando(String comando) {
		try {
			ProcessBuilder builder = new ProcessBuilder();
			builder.command("cmd", "/c", comando);

			Process process = builder.start();

			BufferedReader bufferedReader = 
					new BufferedReader(
							new InputStreamReader(process.getInputStream()));

			String linha = null;
			while ((linha = bufferedReader.readLine()) != null) {
				System.out.println(linha);
			}
		} catch (Exception ex) {
			ex.printStackTrace(System.out);
		}
	}

}
