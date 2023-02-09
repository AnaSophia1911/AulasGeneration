package exercicio1Aula;

import java.util.Scanner;

public class exercicio2If {

	public static void main(String[] args) {
	
		int a,b,c; 
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite o valor de A:");
		a = leia.nextInt();
		System.out.println("\nDigite o valor de B:");
		b = leia.nextInt();
		System.out.println("\nDigite o valor de C:");
		c = leia.nextInt();
		 if(a+b>c) {
			 System.out.println("\nO valor de 'a+b' e: "+(a+b)+" e e maior que 'c'.");	 	 
		 }
		 else if(a+b == c) {
			 System.out.println("\nO valor de 'a+b' e: "+(a+b)+" e e igual a 'c'.");
		 }	 
		 else if(a+b < c) {
			 System.out.println("\nO valor de 'a+b' e: "+(a+b)+" e e menor que 'c'.");
			  
		 }
		
	}

}
