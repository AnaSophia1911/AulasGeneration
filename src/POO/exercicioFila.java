package POO;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exercicioFila {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Queue<String> banco = new LinkedList<String>();

		int o;
	do {	
		System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("\nOpção 1: Adicionar um novo Cliente na fila: ");
		System.out.println("\nOpção 2: Clintes na fila: ");
		System.out.println("\nOpção 3: Chamar próximo cliente: ");
		System.out.println("\nOpção 0: Sair do sistema.");
		System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		o = leia.nextInt();
		switch(o) {
		case 1:
			leia.nextLine(); 
			System.out.println("\nDigite seu nome: ");
			String cliente = leia.nextLine(); 
			banco.add(cliente);
		break;
		case 2:
			 
			System.out.println("\nPessoas na fila: "+banco+".");
		break;
		case 3:
			 
			System.out.println("\nSenhore "+banco.peek()+", sua vez.");
			banco.remove();
		break;
		case 0:
			System.out.println("\nAgradecemos por utilizar o sistema de filas.");
		break;
		default:
			System.out.println("\nOpção inválida!");
			}
		}while(o!=0);
	}

}
