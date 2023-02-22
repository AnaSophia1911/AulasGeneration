package POO;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("\nBem vinde a livraria Ler e Saber! Por favor escolha uma opção:");
		System.out.println("\nOpção 1: Adicionar livro");
		System.out.println("\nOpção 2: Listar todos os livros");
		System.out.println("\nOpção 3: Remover livro");
		System.out.println("\nOpção 0: Sair do sistema");
		System.out.println("\n::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		int op = leia.nextInt();
		
		switch(op) {
		
		case 1:
			System.out.println("\nDigite o nome do livro o qual deseja adicionar:");
			String livro = leia.nextLine();
			pilha.add(livro);
		break;
		
		case 2:
			System.out.println("\nLivros na pilha:"+pilha+".");
		break;
		
		case 3:
			System.out.println("\nRemovendo"+pilha.peek());
		break;
		
		case 0:
			System.out.println("\nObrigada por utilizar nosso sistema<3");
		break;
		default:
			System.out.println("\nOpção inválida!");
		
		}
	
	
	}

}
