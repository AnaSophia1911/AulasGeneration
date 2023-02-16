package exercicios;

import java.util.Scanner;

public class exercicio5while {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int n,idademenor=0,idademaior=0;
		System.out.println("Digite sua idade: ");
		n = leia.nextInt();
		while(n>=0) {
		if(n<21) {
		idademenor++;
		}
		if(n>50) {
		idademaior++;
			}
		System.out.println("digite sua idade: ");
		n = leia.nextInt();
		}
		System.out.println("pessoas maiores de 50 anos: "+idademaior+".");
		System.out.println("pessoas menores de 21 anos: "+idademenor+".");
		
	}

}
