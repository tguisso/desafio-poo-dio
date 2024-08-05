package com.desafio_poo_dio;

import com.desafio_poo_dio.funcionalidadesIphone.AparelhoTelefonico;
import com.desafio_poo_dio.funcionalidadesIphone.Navegador;
import com.desafio_poo_dio.funcionalidadesIphone.ReprodutorMusical;
import com.desafio_poo_dio.funcionalidadesIphone.impl.IPhone;

public class DesafioPooDioApplication {

	public static void main(String[] args) {
		
		AparelhoTelefonico telefone = new IPhone();
		telefone.ligar("(27)90000-0000");
		telefone.iniciarCorreioDeVoz();
		telefone.atender();
		System.out.println();
		
		Navegador navegador = new IPhone();
		navegador.exibirPagina("www.google.com");
		navegador.adicionarNovaAba();
		navegador.atualizarPagina();
		System.out.println();
		
		ReprodutorMusical reprodutorMusical = new IPhone();
		reprodutorMusical.selecionarMusica("Tempo Perdido");
		reprodutorMusical.tocar();
		reprodutorMusical.pausar();
		

	}
}

