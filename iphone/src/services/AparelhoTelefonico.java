package services;

public class AparelhoTelefonico {

	String numeroTelefone;

	public void atender() {
		System.out.println("Telefone Atendido!");
	}

	public void iniciarCorreioDeVoz() {
		System.out.println("Correio de voz iniciado!");
		
	}
	
	public String ligar(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
		System.out.println("Ligando para o número: "+numeroTelefone);
		return numeroTelefone;

	}

}
