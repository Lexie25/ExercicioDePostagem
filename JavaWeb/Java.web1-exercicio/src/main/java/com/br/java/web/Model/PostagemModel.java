package com.br.java.web.Model;
import java.util.HashMap;
import java.util.Map;

public class PostagemModel {

	private String usuario;
	private String postagem;
	
	public PostagemModel() {
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
	public PostagemModel(String usuario, String postagem) {
		this.usuario = usuario;
		this.postagem = postagem;
		
	}
	
	public String toString () {
		StringBuilder modelo = new StringBuilder();
		modelo.append("usuario:" + this.usuario);
		modelo.append("\nPostou :" + this.postagem);
		modelo.append("\n");
		
		return modelo.toString();
	}
	Map<Integer, String> postagens = new HashMap<Integer, String>();
	
}
