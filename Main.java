package GerenciamentoPacienteMedico;

public class Main {

	public static void main(String[] args) {
		Clinica clinica = new Clinica();
		Paciente paciente1 = new Paciente("Pedro", "Rua x,125", "997774544", 25,"10:45");
		Paciente emerlly = new Paciente("Emerlly", "Rua Ermelino Soza, 581","99999999", 30, "11:30");
		Medico medico1 = new Medico("Dr Joao","Rua alfa, 322", "888888", 56, "");
		Medico  medico2 = new Medico("Dr. Paulo", "Rua y,350", "97444556",45, "");
		
		clinica.addPacientes(paciente1);
		clinica.addPacientes(emerlly);
		clinica.addMedicos(medico1);
		clinica.addMedicos(medico2);
		
		paciente1.marcarConsulta();
		emerlly.marcarConsulta();
		
		clinica.horariosConsulta();
		medico1.tratamento();
		medico2.tratamento();
		
		

	}

}
