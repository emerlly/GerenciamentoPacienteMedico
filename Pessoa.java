package GerenciamentoPacienteMedico;

abstract class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	private int idade;
	private String horaConsulta;
	
	public Pessoa(String nome, String endereco, String telefone, int idade, String horaConsulta) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.idade = idade;
		this.horaConsulta = horaConsulta;
	}
	


	public abstract void marcarConsulta();
	
	public abstract void tratamento();

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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getHoraConsulta() {
		return horaConsulta;
	}

	public void setHoraConsulta(String horaConsulta) {
		this.horaConsulta = horaConsulta;
	}
	

	
	
}
