package GerenciamentoPacienteMedico;

public class Paciente extends Pessoa{

	public Paciente(String nome, String endereco, String telefone, int idade, String horaConsulta) {
		super(nome, endereco, telefone, idade, horaConsulta);
		
	}
	
	public void marcarConsulta() {
		if(getIdade() > 18) {
		System.out.println("Consulta marcada para o paciente " + getNome());	
		}else {
			System.out.println("Menores de idade necessitam de acompanhante");
			System.out.println("--------------------------------------------------------");
		
		}
		
	}
	
	public void tratar() {
		System.out.println("Tratamento realizado ");
		System.out.println("--------------------------------------------------------");
			
	}

	@Override
	public void tratamento() {
		// TODO Auto-generated method stub
		
	}
	

}
