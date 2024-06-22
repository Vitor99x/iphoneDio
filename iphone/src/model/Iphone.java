package model;

import java.util.Scanner;

import services.AparelhoTelefonico;
import services.NavegadorDeInternet;
import services.ReproduzirMusica;

public class Iphone {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("o que deseja fazer com o iphone? \n1-Musica\n2-Navegar\n3-ligação/correio de voz");
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Bem vindo ao aplicativo de música ");
			ReproduzirMusica musica = new ReproduzirMusica();
			sc.nextLine();
			System.out.println("Escolha uma musica:");
			String musicaEscolhida = sc.nextLine();

			musica.selecionarMusica(musicaEscolhida);
			

			System.out.println("Deseja continuar ouvindo a música? (Sim/Não)");
			String tocarOuPausar = sc.nextLine();

			if (tocarOuPausar.equalsIgnoreCase("Sim")) {
				musica.tocarMusica();
			} else {
				musica.pausarMusica();
			}

			break;

		case 2:
			NavegadorDeInternet web = new NavegadorDeInternet();
			System.out.println("Bem vindo ao aplicativo de internet");
			System.out.println("Escolha uma funcao \n1-Exibir Pagina \n2-Atualizar pagina \n3-Adicionar Nova aba");
			int escolha = sc.nextInt();
			switch (escolha) {
			case 1:
				sc.nextLine();
				System.out.println("DIGITE A URL DA PAGINA DESEJADA ");
				String pagina = sc.nextLine();
				web.exibirPagina(pagina);
				break;
			case 2:
				web.atualizarPagina();
				break;
			case 3:
				web.adicionarNovaAba();
				break;

			}
			break;
			
		case 3:
			sc.nextLine();
			System.out.println("bem vindo ao aplicativo de ligação/correio de voz");
			AparelhoTelefonico discagem = new AparelhoTelefonico();
			System.out.println("Escolha uma funcao \n1-ligar \n2-atender \n3-iniciarCorreioDeVoz");
			int a = sc.nextInt();
			switch (a) {
			case 1:
				sc.nextLine();
				System.out.println("digite o numero que deseja ligar ");
				String numero = sc.nextLine();
				discagem.ligar(numero);
				break;
			case 2:
				discagem.atender();
				break;
			case 3:
				discagem.iniciarCorreioDeVoz();
				break;

			}
			break;

		default:
			System.out.println("Código invalido! digite entre 1 a 3");
		}

		sc.close();
	}
}
