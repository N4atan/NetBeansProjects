/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClonePokemon;

import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author NATANGABRIELWILDNERD
 */
public class Rota2 {

	public String[] messageFirstOne;
	public boolean firstOne = true;
	public String[] messageOtherTimes;

	public Treinador[] listaTreinadores;
	public boolean treinadoresDerrotados = false;

	public Pokemon[] listaPokemons;

	public Rota2(Dados dados) {
		listaTreinadores = new Treinador[]{
			new Treinador("Cacador Hally"), new Treinador("Molly"), new Treinador("Jovem Fred"), new Treinador("Jeferson")
		};

		listaPokemons = new Pokemon[]{
			new Pokemon("Spearow", dados.rolaSomaResultDados(), dados.rolaSomaResultDados(), dados.rolaSomaResultDados(), dados.rolaSomaResultDados()),
			new Pokemon("Rattata", dados.rolaSomaResultDados(), dados.rolaSomaResultDados(), dados.rolaSomaResultDados(), dados.rolaSomaResultDados()),
			new Pokemon("Butterfree", dados.rolaSomaResultDados(), dados.rolaSomaResultDados(), dados.rolaSomaResultDados(), dados.rolaSomaResultDados()),
			new Pokemon("Pikachu", dados.rolaSomaResultDados(), dados.rolaSomaResultDados(), dados.rolaSomaResultDados(), dados.rolaSomaResultDados())
		};

		messageFirstOne = new String[]{
			"Bem-vindo a Rota 2!",
			"Voce acaba de sair de Viridian e esta a caminho da Floresta.",
			"Prepare-se para enfrentar alguns treinadores ao longo do caminho.",
			"Boa sorte na sua jornada, treinador!"
		};

		messageOtherTimes = new String[]{
			"Voce voltou a Rota 2!",
			"Lembre-se de que ainda poder haver desafios e treinadores esperando por voce.",
			"Continue sua jornada ate a Grande Floresta e boa sorte!"
		};
	}

	public void showMessageFirstOne() {
		System.out.println("Narrador: ");
		for (String text : messageFirstOne) {
			System.out.println(text);
		}
	}

	public void showMessageOtherTime() {
		System.out.println("Narrador: ");
		for (String text : messageOtherTimes) {
			System.out.println(text);
		}
	}

	public int howMany(Dados dados, Scanner sc) {
		System.out.println("Narrador: ");
		System.out.print("""
					Vamos rolar os dados, para ver quantos treinadores voce vai enfrentar!
                                           Aperte ENTER para rolar os Dados... 
                     """);
		TerminalUtils.block(sc);

		TerminalUtils.sleep(5000);

		dados.rolarDados();
		
		System.out.println("Narrador: Você enfrentará " + dados.dado1 + " treinadores nesta rota!");
		TerminalUtils.block(sc);
		
		return dados.dado1;
	}

	public void iniciarBattles(Scanner sc, Dados dados, App app, Treinador player) {
		int qtdTreinadores = howMany(dados, sc);
		

		//Adicionar o for par abatalhar
		for (int i = 0; i < qtdTreinadores; i++) {
			//Vai pegar um treinador
			Treinador treinadorDaVez = listaTreinadores[i];
			int indexPokemonDaVez = (int) (Math.random() * 4);

			//Vai setar um pokemon pra ele
			treinadorDaVez.adicionarAoTime2(listaPokemons[indexPokemonDaVez]);

			System.out.println("\nNarrador: \nUm novo desafiante aparece!");
			System.out.println("Voce enfrentara o/a treinador(ar): " + treinadorDaVez.name);
			TerminalUtils.block(sc);

			//Inicia batalha
			app.batalhar(player.time.get(0), treinadorDaVez.time.get(0), sc, dados);
			listaPokemons[indexPokemonDaVez].setHp(listaPokemons[indexPokemonDaVez].getHpMax());
			
			Screen.clearSimple();

			// Verifica se o Pokémon do jogador ainda está vivo
			if (!player.time.get(0).estaVivo()) {
				System.out.println("Seu Pokémon foi derrotado. Fim da rota!");
				return; // Sai do método e volta ao fluxo principal (main)
			}
		}

		System.out.println("""
					Narrador:
                                           Bom, voce passou pelos treinadores e voltou para a cidade de Viridian!
                     """);
		treinadoresDerrotados = true;
		App.localDoJogo = "Viridian";
		TerminalUtils.block(sc);
	}
	
	public void init2(Scanner sc, Dados dados, App app, Treinador player) {
		Screen.clearSimple();
		
		//Se for a primeira vez ele aparece mensagem de bem vindo
		if(firstOne){
			showMessageFirstOne();
			TerminalUtils.block(sc);
			iniciarBattles(sc, dados, app, player);
			firstOne = false;
		} else { //Caso não, vai aparecer outra e dps o menu.
			showMessageOtherTime();
			TerminalUtils.block(sc);
			
			System.out.print("""
					O que voce deseja fazer? 
					[ 1 . Avançar ] 
					[ 2. Voltar ] 
                                           > 
						 """);
			
			int escolha = sc.nextInt();
			sc.nextLine();

			switch (escolha) {
				case 1:
					//Checa se foram derrotados --> Inutil por enquanto, pois idependente, ira setar como derrotados.
					if (!treinadoresDerrotados) {
						iniciarBattles(sc, dados, app, player);
					} else {
						//Avançar pra grande floresta!
					}
					break;

				case 2:
					App.localDoJogo = "Viridian";
					break;

				default:
					System.out.println("Escolha Invalida!");
					break;
			}
			
		}
	}
}
