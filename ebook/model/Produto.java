package ebook.model;

public abstract class Produto {

	private int id;
	private String titulo;
	private String autor;
	private float preco;
	private int quantidade;

	public Produto(int id, String titulo, String autor, float preco, int quantidade) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public boolean tirar (int tirar) {

		if (this.getQuantidade() < tirar) {
			System.out.println("\nSem estoque!");
			return false;
		}

		this.setQuantidade(this.getQuantidade() - tirar);
		return true;
	}

	public void acrescentar(int acrescentar) {

		this.setQuantidade(this.getQuantidade() + acrescentar);
	}
	
	public void visualizar() {
		
		System.out.println("ID do E-book: " + getId());
		System.out.println("Título do E-book: " + getTitulo());
		System.out.println("Nome do Autor: " + getAutor());
		System.out.println("Valor do E-book (R$): " + getPreco());
		System.out.println("Quantidade disponível: " + getQuantidade());
	
	}
}
