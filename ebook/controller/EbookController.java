package ebook.controller;

import java.util.ArrayList;

import ebook.model.Ebook;
import ebook.model.Produto;
import ebook.repository.EbookRepository;

public class EbookController implements EbookRepository {

    private ArrayList<Produto> listaLivros = new ArrayList<Produto>();

    int numero = 0;

    @Override
    public void cadastrar(Produto produto) {
        listaLivros.add(produto);
        System.out.println("E-book cadastrado com sucesso!");
    }

    @Override
    public void listarTodas() {
        for (var produto : listaLivros) {
            produto.visualizar();
        }
    }

    @Override
    public void atualizar(int id, Produto novoProduto) {
        for (int i = 0; i < listaLivros.size(); i++) {
            Produto produto = listaLivros.get(i);
            if (produto.getId() == id) {
                listaLivros.set(i, novoProduto);
                return;
            }
        }
        System.out.println("E-book não encontrado para atualização.");
    }

    @Override
    public void excluir(int id) {
        for (int i = 0; i < listaLivros.size(); i++) {
            Produto produto = listaLivros.get(i);
            if (produto.getId() == id) {
                listaLivros.remove(i);
               
                return;
            }
        }
        System.out.println("E-book não encontrado para exclusão.");
    }

    public int gerarNumero() {
        return ++numero;
    }

    public Ebook buscarPorId(int idParaAtualizar) {
        for (Produto ebook : listaLivros) {
            if (ebook.getId() == idParaAtualizar) {
                return (Ebook) ebook;
            }
        }
        return null; 
    }
}
