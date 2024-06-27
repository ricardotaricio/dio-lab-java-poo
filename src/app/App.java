package app;

import dispositivos.IPhone;

public class App {
	public static void main(String[] args) {
		IPhone iphone = new IPhone();
		
		System.out.println("REPRODUTOR MUSICAL\n");
		iphone.selecionarMusica("Musica");
		iphone.tocar();
		iphone.pausar();
		
		System.out.println("\n\nNAVEGADOR DE INTERNET\n");
		iphone.adicionarNovaAba();
		iphone.exibirPagina("http://www.google.com");
		iphone.atualizarPagina();
		
		System.out.println("\n\nAPARELHO TELEFONICO\n");
		iphone.ligar("123456789");
		iphone.atender();
		iphone.iniciarCorreioVoz();
	}
}
