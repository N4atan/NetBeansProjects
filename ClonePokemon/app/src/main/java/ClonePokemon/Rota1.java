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
	public String[] npcDialogue;
	public String[] afterNpcDialogue;
	public String[] commonEnding;

	public Rota1() {
		leavePallet = new String[]{
			"Depois de pegar seu Pokemon com o Professor Oak, voce deixa o laboratorio e segue em direcao a Rota 1", 
			"O primeiro passo em sua jornada.", 
			"A cidade de Pallet fica para tras, e a estrada de terra diante de voce se estende ate a proxima cidade, Viridian City.",
			"Enquanto caminha, voce ouve os sons de Pokemon selvagens na grama alta ao seu redor.",
			"O vento refresca o rosto, e a sensacao de liberdade eh intensa.", 
			"Seu objetivo agora eh claro: chegar a Viridian City, onde voce podera se preparar para os proximos desafios.",
			"Voce tem 2 opcoes: ",
			
		};
		
		beforeBattle = new String[]{
			"Enquanto voce caminha pela Rota 1, o som da natureza ao seu redor eh relaxante.",
			"O vento suave balanca as arvores e a grama alta ao seu lado. Mas, de repente, voce escuta um barulho vindo da grama.",
			"Algo se move rapidamente entre os arbustos, derrepente aparece um pokemon!"
		};
		
		afterBattle = new String[]{
			"Apos o encontro com o pokemon selvagem, voce respira aliviado, seu Pokemon parece forte e confiante.",
			"Voce observa a estrada a frente, com arvores e grama se estendendo ate onde os olhos podem ver.",
			"O caminho continua aberto, e uma sensacao de determinacao cresce dentro de voce.",
		};
		
		npcDialogue = new String[]{
			"Ola, treinador!", 
			"Vejo que voce acabou de comecar sua jornada. Tome cuidado na Rota 1!", 
			"As vezes, Pokemon selvagens podem aparecer de repente e te atacar.", 
			"Se perceber que nao conseguira vencer uma batalha, nao tenha vergonha de fugir. A seguranca eh sempre a prioridade!"
		};
		
		afterNpcDialogue = new String[]{
			"Seguindo o conselho do NPC, voce atravessa a Rota 1 com cuidado, sempre atento aos movimentos na grama alta.",
			"Seu Pokemon ao seu lado esta pronto para qualquer desafio que surja.",
			"Depois de algum tempo caminhando, voce começa a avistar os primeiros sinais de Viridian City no horizonte.",
		};
		
		commonEnding = new String[]{
			"Com passos firmes, voce alcanca a entrada da cidade. O ar parece diferente, carregado de novas possibilidades.",
			"Bem-vindo a Viridian City, o proximo passo em sua jornada como treinador Pokemon."
		};
	}
	
	public void leavingPallet() {
		System.out.println("\nNarrador:");
		for(String text : leavePallet) { System.out.println(text);}
	}
	
	public int i = 0;
	public String leavingPallet2() {
		if(i < leavePallet.length) {
			return leavePallet[i++];
		} else {
			return "END";
		}
	}
	
	public void initializationBattle() {
		System.out.println("\nNarrador:");
		for(String text : beforeBattle) { System.out.println(text); }
	}
	
	public int k =0;
	public String initializationBattle2() {
		if(k < beforeBattle.length) {
			return leavePallet[k++];
		} else {
			return "END";
		}
	}

	public Pokemon firstEncounter(Dados dados) {
		if(Math.random() < 0.5){
			return new Pokemon("Rattata", dados.rolaSomaResultDados(), dados.rolaSomaResultDados(), dados.rolaSomaResultDados(), dados.rolaSomaResultDados());
		} else {
			return new Pokemon("Pidgey", dados.rolaSomaResultDados(), dados.rolaSomaResultDados(), dados.rolaSomaResultDados(), dados.rolaSomaResultDados());
		}
	}	
	
	public void afterBattle(){
		System.out.println("\nNarrador:");
		for(String text : afterBattle) { System.out.println(text); }
	}
	
	public void interactWithNpc() {
		System.out.println("\nDouglas:");
		for(String text : npcDialogue) { System.out.println(text); }	
	}
	
	public String interactWithNpc2() {
		String fullDialogue = String.join("\n", npcDialogue);
		return fullDialogue;
	}
	
	public void showEnding(){
		System.out.println("\nNarrador:");
		for(String text : commonEnding) { System.out.println(text); }
		//TerminalUtils.block(sc);
	}
	
	public int j = 0;
	public String showEnding2(){
		if(j < commonEnding.length) {
			return commonEnding[j++];
		} else {
			return "END";
		}
	}
	
	public void init(App app, Treinador player, Scanner sc, Dados dados) {
		Screen.clearSimple();
		
		leavingPallet();
		
		System.out.print("O que voce deseja fazer? \n> ");
		int escolha = sc.nextInt();
		sc.nextLine();
		
		switch(escolha) {
			case 1:
				interactWithNpc();
				TerminalUtils.block(sc);
				break;
			
			case 2:
				initializationBattle();
				TerminalUtils.block(sc);
				
				app.batalhar(player.time.get(0), firstEncounter(dados), sc, dados);
				Screen.clearSimple();
				
				afterBattle();
				TerminalUtils.block(sc);
				break;
				
			default:
				System.out.println("Escolha Inválida!");
				break;
		}
		
		showEnding();
		TerminalUtils.block(sc);
		App.localDoJogo = "Viridian";
		
	}
}
