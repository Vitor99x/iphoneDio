package services;

public class NavegadorDeInternet {
	public String url;

	public String exibirPagina(String url) {
		this.url = url;
		System.out.println("acessando a url: "+url);
		return url;

	}
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada!");
	}
	
	public void atualizarPagina() {
		System.out.println("Pagina Atualizada!");
	}
}
