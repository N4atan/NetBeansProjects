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
public class ViridianCity {
	public CentroPokemon centroPokemon;
	public String[] dialogueOfficer;
	public String[] messageFirstTime;
	public boolean saiuDaCidade;
	
	public ViridianCity() {
		centroPokemon = new CentroPokemon();
		
		dialogueOfficer = new String[] {
			"Pare aí, treinador! A entrada nesta rota está interditada",
                          "Houve um deslizamento de pedras, e estamos trabalhando para liberar o caminho",
                          "Volte mais tarde quando for seguro!"
		};
	}
	
	public void init(Scanner sc, Treinador player) {
		Screen.clearSimple();
		
		while(App.localDoJogo.equals("Viridian")) {
			Screen.clearSimple();
			System.out.println("""
						----------------------------------------------
						-	Cidade de Viridian		   -
						----------------------------------------------
						[ 1 . Visitar o Centro Pokemon ] 
						[ 2. Ir para a Rota 15 ] 
						[ 3. Ir para a Rota 2 ]
						 """);
			System.out.print(" O que voce deseja fazer? \n> ");
			int escolha = sc.nextInt();
			sc.nextLine();
			
			switch(escolha) {
				case 1:
					this.centroPokemon.init(sc, player);
					break;
				
				case 2:
					System.out.println("\nOfficial John:");
					for(String text : dialogueOfficer) { System.out.println(text); }
					TerminalUtils.block(sc);
					break;
					
				case 3:
					App.localDoJogo = "Rota 2";
					break;
					
				default:
					break;
			}
			
		} 
	}
}
