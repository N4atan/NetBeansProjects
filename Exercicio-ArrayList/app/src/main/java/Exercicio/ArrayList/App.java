/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Exercicio.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	private ArrayList<produto> listaDeProdutos = new ArrayList<>();
	private ArrayList<produto> carrinhoCompras = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1 - Adicionar itens");
			System.out.println("2 - Remover Produtos");
			System.out.println("3 - Visualizar carrinho");

			int escolhaMenu = sc.nextInt();
			sc.nextLine();

			switch (escolhaMenu) {
				case 1:
					for (int i = 0; i < listaDeProdutos.size(); i++) {
						produto produto = listaDeProdutos.get(i);
						System.out.println(i); // Índice correto
						System.out.println(produto);
						System.out.println("- - - - - - - - -");
					}

					break;
			}

		}
	}
}
