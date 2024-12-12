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
		
			Screen.clearSimple(); 
			
			System.out.println("""
						Professor Oak:
						Ola! Seja bem-vindo ao incrivel mundo dos Pokemon! 
						Meu nome eh Professor Carvalho.
						Sou um pesquisador dedicado ao estudo dessas criaturas fascinantes que compartilham este mundo conosco.
						Hoje, eh um dia muito especial: voce esta prestes a iniciar sua jornada como treinador Pokemon! 
						Mas, antes de partir, voce precisara de um companheiro para acompanha-lo nessa aventura. 
						Aqui estao tres Pokemon iniciais. Cada um deles possui habilidades unicas e personalidades diferentes. Escolha com sabedoria!
						""");
			
			TerminalUtils.sleep(2000);
			System.out.println("[ 1 - Charmander - O Pokemon Lagarto ] # [ 2 - Bulbasaur - O Pokemon Semente ] # [ 3 - Squirtle - O Pokemon Tartaruga ]");
			System.out.print (">  ");
			int escolhaOak = sc.nextInt();
			sc.nextLine ();

			//Precisa rolar os dados para definir atributos. Rola e soma = setAtributo. Ai repete!
			
			
			System.out.print("""
						\nProfessor Oak:
						Boa escolha! Agora vamos rolar os dados e definir os atributos!
						Aperte ENTER para rolar todos os dados!
						""");
			sc.nextLine();
			

			int hp = dados.rolaSomaResultDados() + dados.rolaSomaResultDados();
			int forca = dados.rolaSomaResultDados();
			int defense = dados.rolaSomaResultDados();
			int speed = dados.rolaSomaResultDados();

			if(escolhaOak == 1){
				player.adicionarAoTime(new Pokemon("Charmander", hp, forca, defense, speed));
			} else if(escolhaOak == 2) {
				player.adicionarAoTime(new Pokemon("Bulbasaur", hp, forca, defense, speed));
			} else if(escolhaOak == 3) {
				player.adicionarAoTime(new Pokemon("Squirtle", hp, forca, defense, speed));
			} else {
				player.adicionarAoTime(new Pokemon("Bulbasaur", hp, forca, defense, speed)); 
			}
			
			
			player.exibirTime();

			TerminalUtils.sleep(2000);
			System.out.println("""
						\nProfessor Oak:
						Agora, sua jornada esta prestes a comecar. 
						O mundo dos Pokemon esta repleto de desafios, batalhas e descobertas incriveis. 
						Confie no seu Pokemon e no seu instinto, e tenho certeza de que voce sera bem-sucedido.
						Boa sorte! Vou ficar ansioso para ouvir sobre suas aventuras. 
						Ah, e nao se esqueca de vir me visitar de vez em quando para me contar o que encontrou por ai!
						""");

			TerminalUtils.block(sc);
		
	}

}

