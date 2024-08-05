package com.desafio_poo_dio.funcionalidadesIphone.impl;

import com.desafio_poo_dio.funcionalidadesIphone.AparelhoTelefonico;
import com.desafio_poo_dio.funcionalidadesIphone.Navegador;
import com.desafio_poo_dio.funcionalidadesIphone.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, ReprodutorMusical, Navegador {

	@Override
	public void ligar(String numero) {
		System.out.println("Realizando ligação no iPhone para o número: "+ numero + ".");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo uma ligação no iPhone.");
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("Iniciando correio de voz no iPhone.");
	}

	@Override
	public void tocar() {
		System.out.println("Tocando música no iPhone.");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando música no iPhone.");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando a música "+ musica + " no iPhone.");
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo a página "+ url + " no iPhone.");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba no navegador do iPhone.");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página no navegador do iPhone.");
	}

}
