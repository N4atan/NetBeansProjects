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
	public ProfessorOak(){
		super("Professora Oak" );
	}
	
	public void introduction(Treinador player, Scanner sc) {
		System.out.println("Olá, treinador! Seja bem-vindo ao incrível mundo dos Pokémon! Meu nome é Professor Carvalho, e sou um pesquisador dedicado ao estudo dessas criaturas fascinantes que compartilham este mundo conosco.\n" +
					  "\n" +
					  "Hoje, é um dia muito especial: você está prestes a iniciar sua jornada como treinador Pokémon! Mas, antes de partir, você precisará de um companheiro para acompanhá-lo nessa aventura. Aqui estão três Pokémon iniciais. Cada um deles possui habilidades únicas e personalidades diferentes. Escolha com sabedoria!");
		
		System.out.println("[1] - Charmander - O Pokémon Lagarto.\n[2] - Bulbasaur - O Pokémon Semente.\n[3] - Squirtle - O Pokémon Tartaruga");
		int escolhaOak = sc.nextInt();
		sc.nextLine();
	}
}
