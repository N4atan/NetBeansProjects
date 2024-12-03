/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClonePokemon;

import java.util.Scanner;

/**
 *
 * @author NATANGABRIELWILDNERD
 */
public class ProfessorOak extends Treinador {

	public ProfessorOak() {
		super("Professora Oak");
	}

	public void introduction(Treinador player, Scanner sc, Dados dados) {
		System.out.println("Professor Oak"
				+ "\n"
				+ "Ola! Seja bem-vindo ao incrivel mundo dos Pokemon! Meu nome eh Professor Carvalho, e sou um pesquisador dedicado ao estudo dessas criaturas fascinantes que compartilham este mundo conosco.\n"
				+ "Hoje, eh um dia muito especial: voce esta prestes a iniciar sua jornada como treinador Pokemon! Mas, antes de partir, você precisara de um companheiro para acompanha-lo nessa aventura. Aqui estao tres Pokemon iniciais. Cada um deles possui habilidades únicas e personalidades diferentes. Escolha com sabedoria!");

		System.out.println("[1] - Charmander - O Pokemon Lagarto.\n[2] - Bulbasaur - O Pokemon Semente.\n[3] - Squirtle - O Pokemon Tartaruga");
		System.out.print (">  ");
		int escolhaOak = sc.nextInt();
		sc.nextLine ();
		
		//Precisa rolar os dados para definir atributos. Rola e soma = atributo. Ai repete!
		
		System.out.print("Professor Oak \n" + 
				"Boa escolha! Agora vamos rolar os dados e definir os atributos!" + 
				"Aperte ENTER para rolar todos os dados!");
		sc.nextLine();
		
		int hp = dados.rolaSomaResultDados();
		int forca = dados.rolaSomaResultDados();
		int defense = dados.rolaSomaResultDados();
		int speed = dados.rolaSomaResultDados();
		
		if(escolhaOak == 1){
			player.adicionarAoTime(new Pokemon("Charmander", hp, forca, defense, speed));
		} else if(escolhaOak == 2) {
			player.adicionarAoTime(new Pokemon("Bulbasaur", hp, forca, defense, speed));
		} else {
			player.adicionarAoTime(new Pokemon("Squirtle", hp, forca, defense, speed));
		}
		
		player.exibirTime();
		
		System.out.print("\nAperte ENTER para prosseguir!");
		sc.nextLine();
	}

}

