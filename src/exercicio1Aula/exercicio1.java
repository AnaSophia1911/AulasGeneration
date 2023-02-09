package exercicio1Aula;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		int a,m,d;
		int diastotais;
	    Scanner leia = new Scanner(System.in);
			System.out.println("\n digite quantos anos voce ja viveu:");
		a = leia.nextInt();
			System.out.println("\n digite quantos meses voce ja viveu:");
		m =	leia.nextInt();
            System.out.println("\n digite quantos dias voce ja viveu:");
        d = leia.nextInt();
		
		 
			diastotais = (a*365)+(m*30)+d;
        System.out.println("Voce ja viveu " +diastotais+ " dias.");     
        leia.close();
	}

}
