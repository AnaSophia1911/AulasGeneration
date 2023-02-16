package POO;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Setlist {

	public static void main(String[] args) {
	
	Set<Integer> meuSet = new HashSet<Integer>();
	
	Scanner leia = new Scanner(System.in);
	
		for(int x=0;x<10;x++) {
			System.out.println("\nDigite um número: ");
			int n = leia.nextInt();
			meuSet.add(n);
		}
		
		Iterator<Integer> imeuSet = meuSet.iterator();
		
		while(imeuSet.hasNext()) {
			System.out.println(imeuSet.next());
			
		}
	}

}
