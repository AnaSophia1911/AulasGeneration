package POO;

import java.util.Scanner;

public class Matrizes1 {

	public static void main(String[] args) {
		
		float[][] matriz = new float[3][3];
		
		Scanner leia = new Scanner(System.in);
		
		int linha=0,coluna=0;
		float valordiagonal1,valordiagonal2=matriz[0][2]+matriz[1][1]+matriz[2][0];
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.println("\nDigite o próximo valor: ");
				matriz[linha][coluna] = leia.nextFloat();
			}
		}
		valordiagonal1=matriz[0][0]+matriz[1][1]+matriz[2][2]; 
		valordiagonal2=matriz[0][2]+matriz[1][1]+matriz[2][0];
		System.out.println("\nDiagonal principal:"+matriz[0][0]+" "+matriz[1][1]+" "+matriz[2][2]);
		System.out.println("\nDiagonal secundária:"+matriz[0][2]+" "+matriz[1][1]+" "+matriz[2][0]);
		System.out.println("\nSoma da diagonal principal: "+valordiagonal1);
		System.out.println("\nSoma da diagonal secundária: "+valordiagonal2);
	}

}
