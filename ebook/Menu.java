package ebook;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                Livraria de E-books                  ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar E-book                     ");
			System.out.println("            2 - Listar E-books                       ");
			System.out.println("            3 - Atualizar E-books                    ");
			System.out.println("            4 - Excluir E-book                       ");
			System.out.println("            5 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 5) {
				System.out.println("Você está saindo do sistema...");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Cadastrar E-book\n\n");

				break;

			case 2:
				System.out.println("Listar E-books\n\n");

				break;

			case 3:
				System.out.println("Atualizar E-books\n\n");

				break;

			case 4:
				System.out.println("Excluir E-book\n\n");

				break;
			case 5:
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
