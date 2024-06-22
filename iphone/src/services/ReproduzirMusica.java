package services;

public class ReproduzirMusica {
	public String musica;
	
	public String selecionarMusica(String musica) {
		System.out.println("tocando a música: "+musica);
		return musica;
	}

	public void pausarMusica() {
		System.out.println("Música pausada");
	}

	public void tocarMusica() {
		System.out.println("Tocando música");
	}
}
