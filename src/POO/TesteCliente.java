package POO;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente pessoa1 = new Cliente("Ana Sophia","Feminino",18,52388146321l,"Rua do desgosto, número 69.");
		
		Cliente pessoa2 = new Cliente("Elimar Gonzalez","Maculino",42,42069112321l,"Alameda das lágrimas, 420.");

		pessoa1.visualizar();
		pessoa2.visualizar();
	}

}
