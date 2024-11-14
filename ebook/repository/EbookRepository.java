package ebook.repository;

import ebook.model.Produto;

public interface EbookRepository {

	void cadastrar(Produto produto);

	void listarTodas();

	void atualizar(int id, Produto produto);

	void excluir(int id);

}
