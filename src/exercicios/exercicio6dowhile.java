package exercicios;

import java.util.Scanner;

public class exercicio6dowhile {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int n,soma=0;
		
		do {System.out.println("\nDigite um número: ");
		n = leia.nextInt();
			if(n>0 && n!=0){
				soma += n;}
				
			
			
		}while(n!=0);
		System.out.println("\nA soma dos números positivos é de: "+soma+".");
	}

}
