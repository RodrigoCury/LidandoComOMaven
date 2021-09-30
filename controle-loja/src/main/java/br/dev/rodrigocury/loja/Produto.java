package br.dev.rodrigocury.loja;

public class Produto {
	private String nome;
	
	public Produto(String nome){
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		Produto outroProduto = (Produto) obj;
		return this.nome.equals(outroProduto.getNome());
	}
}
