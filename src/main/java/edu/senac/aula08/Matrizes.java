package edu.senac.aula08;

public class Matrizes {

	public static void main(String[] args) {
		int valor[][] = {
							{0, 0 ,0 ,0},
							{0, 1 ,1 ,0},
							{0, 1 ,1 ,0},
							{0, 0 ,0 ,0} 
		 		  		};
		
		for (int i=0;i<=3;i++) {
			for (int j=0;j<=3;j++)
				System.out.print(valor[i][j]);
			System.out.println();
		}
		
	}

}
