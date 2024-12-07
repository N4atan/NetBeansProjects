/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClonePokemon;

import java.util.Scanner;
/**
 * 
 *
 * @author NATANGABRIELWILDNERD
 */
public class Rota1 {

	public String[] leavePallet;
	public String[] afterBattle;
	public String[] beforeBattle;

	public Rota1() {
		leavePallet = new String[]{
			"Depois de pegar seu Pokémon com o Professor Oak, você deixa o laboratório e segue em direção à Rota 1, o primeiro passo em sua jornada. A cidade de Pallet fica para trás, e a estrada de terra diante de você se estende até a próxima cidade, Viridian City.",
			"Enquanto caminha, você ouve os sons de Pokémon selvagens na grama alta ao seu redor. O vento refresca o rosto, e a sensação de liberdade é intensa. Seu objetivo agora é claro: chegar a Viridian City, onde você poderá se preparar para os próximos desafios."
		};
		
		afterBattle = new String[]{
			"Enquanto você caminha pela Rota 1, o som da natureza ao seu redor é relaxante.",
			"O vento suave balança as árvores e a grama alta ao seu lado. Mas, de repente, você escuta um barulho vindo da grama.",
			"Algo se move rapidamente entre os arbustos, derrepente aparece um pokemon!"
		};
		
		beforeBattle = new String[]{
			"Após a batalha intensa, você respira aliviado, seu Pokémon parece mais forte e confiante. Você observa a estrada à frente, com árvores e grama se estendendo até onde os olhos podem ver. O caminho continua aberto, e uma sensação de determinação cresce dentro de você.",
			"Com uma última olhada para trás, você segue em frente, pronto para enfrentar o que mais a jornada tem a oferecer. O horizonte se estende à sua frente, prometendo novas aventuras a cada passo."
		};
	}
	
	//Saída de Pallet para a Rota 1;
	public void leavingPallet(Scanner sc) {
		Screen.clearSimple();
		
		System.out.println("Narrador:");
		for(String text : leavePallet) {
			System.out.println(text);
			TerminalUtils.sleep(3000);
		}
		
		TerminalUtils.block(sc);
	}
	
	//Dentro da Rota 1, vai encontrar 
	public void firstEncounter(App app, Treinador player, Scanner sc, Dados dados) {
		//Mostrar texto antes da batalha;
		System.out.println("Narrador:");
		for(String text : afterBattle) { System.out.println(text); }
		TerminalUtils.block(sc);
		
		if(Math.random() < 0.5){
			Pokemon ratata = new Pokemon("Rattata", 6, 5, 6, 12);
			app.batalhar(player.time.get(0),  ratata, sc, dados);
		} else {
			Pokemon pidgey = new Pokemon("Pidgey", 12, 5, 6, 8);
			app.batalhar(player.time.get(0),  pidgey, sc, dados);
		}
		
		//Depois da batalha;
		System.out.print("\n");
		System.out.println("Narrador:");
		for(String text : beforeBattle) { System.out.println(text); }
		
		TerminalUtils.block(sc);
	}	
	
	
	
}
