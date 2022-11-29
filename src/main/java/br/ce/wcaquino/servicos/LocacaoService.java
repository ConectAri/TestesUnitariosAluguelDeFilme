package br.ce.wcaquino.servicos;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;

import java.util.Date;

import static br.ce.wcaquino.utils.DataUtils.adicionarDias;

public class LocacaoService {

	/*
	public String vPublica;
	protected String vProtegida;
	private String vPrivada;
	String vDefault;


	 */

	// Inclusindo regra que não pode alugar sem filme em estoque

	public Locacao alugarFilme(Usuario usuario, Filme filme) throws Exception {

		if(filme.getEstoque() == 0) {

			throw new Exception(" Filme sem estoque");
		}

		Locacao locacao = new Locacao();
		locacao.setFilme(filme);
		locacao.setUsuario(usuario);
		locacao.setDataLocacao(new Date());
		locacao.setValor(filme.getPrecoLocacao());

		//Entrega no dia seguinte
		Date dataEntrega = new Date();
		dataEntrega = adicionarDias(dataEntrega, 1);
		locacao.setDataRetorno(dataEntrega);
		
		//Salvando a locacao...	
		//TODO adicionar método para salvar
		
		return locacao;
	}


}