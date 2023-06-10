package GerenciamentoPacienteMedico;
import java.util.ArrayList;
import java.util.List;
public class Clinica {
	private List<Paciente> pacientes;
	private List<Medico> medicos;
	
	public Clinica() {
		pacientes = new ArrayList<>();
		medicos = new ArrayList<>();
		
	}
	public void addPacientes(Paciente paciente) {
		pacientes.add(paciente);
	}
	public void removePacientes(Paciente paciente) {
		pacientes.remove(paciente);
	}
	
	public void addMedicos(Medico medico) {
		medicos.add(medico);
	}
	public void removeMedicos(Medico medico) {
		medicos.remove(medico);
	}
	public void horariosConsulta() {
		System.out.println("------------------------------------------------");
		System.out.println("Hórarios de consultas \n");
		for(Paciente paciente : pacientes) {
				System.out.println("Nome: " + paciente.getNome());
				System.out.println("Endereco: " + paciente.getEndereco());
				System.out.println("Telefone: " + paciente.getTelefone());
				System.out.println("Hora consulta: " + paciente.getHoraConsulta());
				System.out.println("------------------------------------------------");
			
		}
		
		
	}
}
