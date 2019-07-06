package com.br.face.zup.Models;

import java.util.Set;

public class PostagemModel {
	
	private String foto;
	private String usuario;
	private String postagem;
		
	//Esse construtor vazio é do spring que tem que tem esse construtor vazio.//
	public PostagemModel(){ 
		
	}
			
	public PostagemModel(String foto, String usuario, String postagem) {
		this.foto = foto;
		this.usuario = usuario;
		this.postagem = postagem;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getPostagem() {
		return postagem;
	}

	public void setPostagem(String postagem) {
		this.postagem = postagem;
	}

	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		StringBuilder modelo = new StringBuilder();
		modelo.append("/nUsuario :" + this.usuario);
		modelo.append("/n");
		modelo.append("/nPostou : " + this.postagem);
		return modelo.toString();
	}
	
	
}
