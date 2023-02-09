package exercicio1Aula;

import java.util.Scanner;

public class exercicio3switchcase {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	int cod,quant;
	float valor; 
	System.out.println("lanchonete da Ana");
	System.out.println("\nCodigo 1 - Cachorro Quente - R$10,00");
	System.out.println("\nCodigo 2 - X-Salada - R$15,00");
	System.out.println("\nCodigo 3 - X-Bacon - R$18,00");
	System.out.println("\nCodigo 4 - Bauru - R$12,00");
	System.out.println("\nCodigo 5 - Refrigerante - R$8,00");
	System.out.println("\nCodigo 6 - Suco de Laranja - R$13,00");
	
	System.out.println("Coloque o codigo do produto: ");
	cod = leia.nextInt();
	System.out.println("Coloque a quantidade de produtos: ");
	quant = leia.nextInt();
	
	switch(cod){
	case 1: 
		valor = quant *10;
		System.out.println("Produto selecionado: cachorro quente--valor total: "+valor+".");
	break;
	case 2: 
		valor = quant *15;
		System.out.println("Produto selecionado: X salada--valor total: "+valor+".");
	break;
	case 3: 
		valor = quant *18;
		System.out.println("Produto selecionado: X bacon--valor total: "+valor+".");
	break;
	case 4: 
		valor = quant *12;
		System.out.println("Produto selecionado: bauru--valor total: "+valor+".");
	break;
	case 5: 
		valor = quant *8;
		System.out.println("Produto selecionado: refrigerante--valor total: "+valor+".");
	break;
	case 6: 
		valor = quant *13;
		System.out.println("Produto selecionado: suco de laranja--valor total: "+valor+".");
	break;
		default:
			System.out.println("\nOpcao invalida.");
		}
	
	
	

	}

}
