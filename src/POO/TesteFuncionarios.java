package POO;

public class TesteFuncionarios {

	public static void main(String[] args) {
		
		Funcionarios func1 = new Funcionarios("Vinícius Leite","Avenida do desespero, número 15","vini.leite@gmail.com","viniciuslindo",3200.21);
		
		Funcionarios func2 = new Funcionarios("Amanda Vicente","Rua da Tristeza, número 47","aman.da@gmail.com","amandinha3321",3100.32);
		
		func1.visualizar();
		func2.visualizar();

	}

}
