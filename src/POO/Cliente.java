package POO;

public class Cliente {
	
	//atributos
	
	public String nomeCliente;
	public String genero;
	public int idade;
	private long cpf;
	private String endereco;
	public Cliente(String nomeCliente, String genero, int idade, long cpf, String endereco) {
		
		this.nomeCliente = nomeCliente;
		this.genero = genero;
		this.idade = idade;
		this.cpf = cpf;
		this.endereco = endereco;
		
		
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void visualizar() {
		System.out.println(nomeCliente+" tem "+idade+" anos, é do gênero: "+genero+" porta o cpf: "+cpf+" e mora em: "+endereco+".");
	}
	
	
	

}
