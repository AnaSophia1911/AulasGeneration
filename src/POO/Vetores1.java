package POO;

import java.util.Scanner;

public class Vetores1 {

	public static void main(String[] args) {
		
		float[] numeros = new float[10];
		
		Scanner leia= new Scanner(System.in);
		
		int x,n;
		
		for(x=0; x<numeros.length; x++) {
			System.out.println("\nDigite o próximo valor: ");
			n = leia.nextInt();
			
			numeros[x] = n;
		}
		
		for(x=0; x<10; x++) {
			System.out.println(numeros[x]);
		}

			System.out.println("\nQual index deseja buscar?");
			x = leia.nextInt();
			
		if(x>=0 && x<10) {
			System.out.println("Na index "+ x +" está o número: "+numeros[x]+".");
		}
		else {
			System.out.println("\nOpção inválida!");
		}
	} 
	

}
