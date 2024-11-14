package ebook.model;

public class Ebook extends Produto {
	
	private String formato;
	private String linkDownload;
	public Ebook(int id, String titulo, String autor, float preco, int quantidade, String formato, String linkDownload) {
		super(id, titulo, autor, preco, quantidade);
		this.formato = formato;
	
		this.linkDownload = linkDownload;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	public String getLinkDownload() {
		return linkDownload;
	}
	public void setLinkDownload(String linkDownload) {
		this.linkDownload = linkDownload;
	}
	
	@Override
	public void visualizar(){
		super.visualizar();
		System.out.println("Formato (Epub, PDF, MOBI): " + getFormato());
		System.out.println("Link do download: " + getLinkDownload());
	}

}
