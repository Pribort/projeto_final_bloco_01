package ebook;

import java.util.InputMismatchException;
import java.util.Scanner;

import ebook.controller.EbookController;
import ebook.model.Ebook;

public class Menu {

    public static void main(String[] args) {

        EbookController ebooks = new EbookController();

        Scanner leia = new Scanner(System.in);

        int id;
        String nome;
        String autor;
        float valor;
        int quantidade;
        String formato;
        String download;

        int opcao;

        while (true) {

            System.out.println("*****************************************************");
            System.out.println("                Livraria de E-books                  ");
            System.out.println("*****************************************************");
            System.out.println("            1 - Cadastrar E-book                     ");
            System.out.println("            2 - Galeria de Livros                    ");
            System.out.println("            3 - Atualizar E-book                     ");
            System.out.println("            4 - Excluir E-book                       ");
            System.out.println("            5 - Sair                                 ");
            System.out.println("*****************************************************");
            System.out.println("Entre com a opção desejada:                          ");

            try {
                opcao = leia.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nDigite valores inteiros!");
                leia.nextLine();
                opcao = 0;
            }

            if (opcao == 5) {
                System.out.println("Você está saindo do sistema...");
                sobre();
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
            case 1:
            	System.out.println("*********************");
            	System.out.println("Cadastrar E-book\n\n");
            
                System.out.println("Digite o ID do E-book a ser cadastrado: ");
                id = leia.nextInt();

                System.out.println("Digite o nome do livro a ser cadastrado: ");
                leia.skip("\\R?");
                nome = leia.nextLine();

                System.out.println("Digite o nome do Autor(a) a ser cadastrado(a): ");
                leia.skip("\\R?");
                autor = leia.nextLine();

                System.out.println("Digite o valor do livro: ");
                valor = leia.nextFloat();

                System.out.println("Digite a quantidade disponível em estoque: ");
                quantidade = leia.nextInt();

                System.out.println("Digite o formato do livro (Epub, PDF, MOBI): ");
                leia.skip("\\R?");
                formato = leia.nextLine();

                System.out.println("Link do Download do E-book: ");
                leia.skip("\\R?");
                download = leia.nextLine();

                Ebook novoEbook = new Ebook(id, nome, autor, valor, quantidade, formato, download);

                ebooks.cadastrar(novoEbook);
                break;

            case 2:
            	System.out.println("*****************************");
                System.out.println("Listar Galeria de Livros:\n\n");
                ebooks.listarTodas();
                break;

            case 3:
              System.out.println("****************************************");
                System.out.print("Digite o ID do E-book a ser atualizado: ");
                id = leia.nextInt();
                Ebook ebookParaAtualizar = ebooks.buscarPorId(id);

                if (ebookParaAtualizar != null) {

                    System.out.print("Digite o novo nome do livro: ");
                    leia.skip("\\R?");
                    nome = leia.nextLine();

                    System.out.print("Digite o novo nome do autor(a): ");
                    autor = leia.nextLine();

                    System.out.print("Digite o novo preço do livro: ");
                    valor = leia.nextFloat();

                    System.out.print("Digite a nova quantidade: ");
                    quantidade = leia.nextInt();

                    System.out.print("Qual o novo formato do livro: ");
                    leia.skip("\\R?");
                    formato = leia.nextLine();

                    System.out.print("Novo link de download: ");
                    leia.skip("\\R?");
                    download = leia.nextLine();

                    Ebook ebookAtualizado = new Ebook(id, nome, autor, valor, quantidade, formato, download);

                    ebooks.atualizar(id, ebookAtualizado);

                    System.out.println("E-book atualizado com sucesso!");
                } else {
                    System.out.println("E-book não encontrado.");
                }

                break;

            case 4:
            	System.out.println("******************");
                System.out.println("Excluir E-book\n\n");

                System.out.print("Digite o ID do E-book a ser excluído: ");
                id = leia.nextInt();

                Ebook ebookParaExcluir = ebooks.buscarPorId(id);

                if (ebookParaExcluir != null) {
                    ebooks.excluir(id);
                    System.out.println("E-book excluído com sucesso!");
                } else {
                    System.out.println("E-book não encontrado.");
                }

                break;

            case 5:
            	System.out.println("*******************");
                System.out.println("Sair do sistema\n\n");
                break;

            default:
                System.out.println("Opção Inválida, por favor refaça a operação.\n\n");
                break;
            }

        }

    }

    private static void sobre() {
        System.out.println("\n*********************************************************");
        System.out.println("Projeto Desenvolvido por: Priscila Bortniuk Santos ");
        System.out.println("Generation Brasil priscilas@generation.org");
        System.out.println("github.com/pribort");
        System.out.println("*********************************************************");

    }
}
