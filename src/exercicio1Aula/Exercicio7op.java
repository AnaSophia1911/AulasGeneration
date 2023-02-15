package exercicio1Aula;

import java.util.Scanner;

public class Exercicio7op {

	public static void main(String[] args) {
		float salario,abono;
	
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite o salário: ");
		salario = leia.nextFloat();
		
		System.out.println("\nDigite o abono: ");
		abono = leia.nextFloat();
		
		System.out.println("\nNovo salário é: "+(salario+abono)+".");

	}

}
