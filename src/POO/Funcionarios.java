package POO;

public class Funcionarios {
	
	public String nome;
	public String endereco;
	private String login;
	private String senha;
	private double salario;
	public Funcionarios(String nome, String endereco, String login, String senha, double salario) {
		
		this.nome = nome;
		this.endereco = endereco;
		this.login = login;
		this.senha = senha;
		this.salario = salario;
		
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void visualizar() {
		System.out.println(nome+" mora em "+endereco+" tem o login de "+login+" a senha de "+senha+" e o salário de "+salario);
	}
	
	

}
