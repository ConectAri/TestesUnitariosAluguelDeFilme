package br.ce.wcaquino.entidades;

import java.util.Objects;

public class Usuario {

	private String nome;
	
	public Usuario() {}
	
	public Usuario(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// Método Iguols para refletir no teste 04
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Usuario usuario = (Usuario) obj;
		return Objects.equals(nome, usuario.nome);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}
}







