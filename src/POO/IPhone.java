package POO;

import POO.AparelhoTelefonico;
import POO.NavegadorInternet;
import POO.ReprodutorMusical;

public class IPhone {

	public static void main(String[] args) {
		IPhone meuIPhone = new IPhone();

		meuIPhone.ligar();
		meuIPhone.atender();
		meuIPhone.iniciarCorreioVoz();

		meuIPhone.tocar();
		meuIPhone.selecionarMusica();
		meuIPhone.pausar();

		meuIPhone.exibirPagina();
		meuIPhone.adicionarNovaAba();
		meuIPhone.atualizarPagina();
	}

	private ReprodutorMusical reprodutorMusical;
	private AparelhoTelefonico aparelhoTelefonico;
	private NavegadorInternet navegadorInternet;

	public IPhone() {
		this.reprodutorMusical = new ReprodutorMusical();
		this.aparelhoTelefonico = new AparelhoTelefonico();
		this.navegadorInternet = new NavegadorInternet();
	}

	// Métodos que delegam para as classes internas
	public void tocar() {
		reprodutorMusical.tocar();
	}

	public void pausar() {
		reprodutorMusical.pausar();
	}

	public void selecionarMusica() {
		reprodutorMusical.selecionarMusica();
	}

	public void ligar() {
		aparelhoTelefonico.ligar();
	}

	public void atender() {
		aparelhoTelefonico.atender();
	}

	public void iniciarCorreioVoz() {
		aparelhoTelefonico.iniciarCorreioVoz();
	}

	public void exibirPagina() {
		navegadorInternet.exibirPagina();
	}

	public void adicionarNovaAba() {
		navegadorInternet.adicionarNovaAba();
	}

	public void atualizarPagina() {
		navegadorInternet.atualizarPagina();
	}
}
