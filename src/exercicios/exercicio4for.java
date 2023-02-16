package exercicios;

import java.util.Scanner;

public class exercicio4for {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int n1,x,impares=0,pares=0;
		
		for(x=0;x<10;x++) {
			System.out.println("Digite um valor: ");
			n1 = leia.nextInt();
			if(n1%2==0) {
			pares++;}
			if(n1%2!=0) {
			impares++;}
		}
	System.out.println("\n A quantidade de numeros pares e: "+pares+".");
	System.out.println("\n A quantidade de numeros impares e: "+impares+".");
	}

}