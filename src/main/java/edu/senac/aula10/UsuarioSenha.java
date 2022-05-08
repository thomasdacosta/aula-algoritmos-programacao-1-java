package edu.senac.aula10;

import java.io.Console;

public class UsuarioSenha {
	
	private static final String VERMELHO = "\u001B[31m";
	private static final String VERDE = "\u001B[32m";
	private static final String AMARELO = "\u001B[33m";
	private static final String BRANCO = "\u001B[37m";
	
	private static Console console = System.console();

	public static void main(String[] args) {
		try {
			OperacoesWindows.limparTela();
			String usuario = digitarUsuario();
			String senha = digitarSenha();
			
			if (usuario.equals("bruce") && senha.equals("batcaverna")) {
				System.out.println();
				System.out.println(VERDE + "Entrando na BatCaverna!!!");
			} else {
				System.out.println();
				System.out.println(VERMELHO + "Usuário ou senha inválidos");
			}
		} catch (Exception ex) {
			ex.printStackTrace(System.out);
		}
	}
	
	public static String digitarUsuario() {
		String usuario = "";
		while (usuario.isEmpty()) {
			System.out.print(AMARELO + "Digite o usuário:");
			System.out.print(BRANCO);
			usuario = console.readLine();
		}
		return usuario;
	}
	
	public static String digitarSenha() {
		String senha = "";
		while (senha.isEmpty()) {
			System.out.print(AMARELO + "Digite a senha:");
			System.out.print(BRANCO);
			senha = String.valueOf(console.readPassword());
		}
		return senha;
	}	
	
}
