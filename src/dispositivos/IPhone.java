package dispositivos;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("Tocando musica");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando musica");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando musica");
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo pagina " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina");
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para numero " + numero);
	}

	@Override
	public void atender() {
		System.out.println("Atendendo telefone");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
	}

}
