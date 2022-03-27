package edu.senac.aula08;

public class Matrizes1 {

	public static void main(String[] args) {
		int valor[][] = {
							{0, 0 ,0 ,0},
							{0, 1 ,1 ,0},
							{0, 1 ,1 ,0},
							{0, 0 ,0 ,0} 
		 		  		};
		
		valor[0][0] = 9;
		valor[3][3] = 9;
		
		for (int i=0;i<=3;i++) {
			for (int j=0;j<=3;j++)
				System.out.print(valor[i][j]);
			System.out.println();
		}
		
	}

}
