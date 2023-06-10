package GerenciamentoPacienteMedico;

public class Medico extends Pessoa{

	public Medico(String nome, String endereco, String telefone, int idade, String horaConsulta) {
		super(nome, endereco, telefone, idade, horaConsulta);
		
	}
	public void marcarConsulta() {
		System.out.println("--------------------------------------------------------");
		System.out.println("Consulta marcada pelo medico " + getNome());
		System.out.println("--------------------------------------------------------");
	}
	public void tratamento() {
		System.out.println("Tratamento realizado pelo medico " + getNome());
		System.out.println("--------------------------------------------------------");
	}

}
