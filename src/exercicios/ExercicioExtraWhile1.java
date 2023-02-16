package exercicios;

import java.util.Scanner;

public class ExercicioExtraWhile1 {

	public static void main(String[] args) {
		
	int n1,calm=0,femNerv=0,masAgro=0,outCalm=0,nerv40=0,calm18=0;
	int idade;
	String genero,calmo,nervoso,agressivo,humor = "";
	
	Scanner leia = new Scanner(System.in);
	System.out.println("Digite o número da sua senha: ");
	n1 = leia.nextInt();
	while(n1<150 && n1>0) {
		System.out.println("\nBem vinde à nossa pesquisa, por favor digite o gênero que se identifica: ");
		genero= leia.next();
	
		if(genero.equalsIgnoreCase("feminino")||genero.equalsIgnoreCase("outros")||genero.equalsIgnoreCase("masculino")) {
			System.out.println("\nDigite sua idade: ");
			idade = leia.nextInt();
			System.out.println("\nVocê se considera um humano calmo, agressivo ou nervoso?");
			System.out.println("\nDigite sua resposta: ");
			humor=leia.next();
			if(humor.equalsIgnoreCase("calmo")||humor.equalsIgnoreCase("nervoso")||humor.equalsIgnoreCase("agressivo")) {
				if(humor.equalsIgnoreCase("calmo")) {
					calm++;
				}
				if(humor.equalsIgnoreCase("nervoso")&& genero.equalsIgnoreCase("feminino")){
						femNerv++;
				}
				if(humor.equalsIgnoreCase("agressivo")&& genero.equalsIgnoreCase("masculino")){
						masAgro++;
				}
				if(humor.equalsIgnoreCase("calmo")&& genero.equalsIgnoreCase("outros")){
						outCalm++;
				}
				
				if(humor.equalsIgnoreCase("nervoso")){
					if(idade>40);
						nerv40++;
				}
				if(humor.equalsIgnoreCase("calmo")){
					if(idade<18);
						calm18++;
				}
			}
			
			
			else {System.out.println("Opção invàlida!");}

		}
		else {System.out.println("Opção invàlida!");}
	}
	
System.out.println("\nO número de pessoas calmas é: "+calm+".");
System.out.println("\nO número de pessoas do gênero feminino nervosas é de:"+femNerv+".");
System.out.println("\nO número de pessoas do gênero masculino agressivos é de:"+masAgro+".");
System.out.println("\nO número de pessoas do gênero putros é de:"+outCalm+".");
System.out.println("\nO número de pessoas maiores de 40 anos nervosas é de"+nerv40+".");
System.out.println("\nO número de pessoas menores de 18 calmas é de"+calm18+".");
	}
}
