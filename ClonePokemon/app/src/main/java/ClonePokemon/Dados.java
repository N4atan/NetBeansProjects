/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClonePokemon;

/**
 *
 * @author NATANGABRIELWILDNERD
 */
public class Dados {

	public int dado1;
	public int dado2;
	public int dado3;
	public int dado4;
	public int dado5;

	public void rolarDados() {
		this.dado1 = (int) (Math.random() * 6) + 1;
		this.dado2 = (int) (Math.random() * 6) + 1;
		this.dado3 = (int) (Math.random() * 6) + 1;
		this.dado4 = (int) (Math.random() * 6) + 1;
		this.dado5 = (int) (Math.random() * 6) + 1;
	}

	public int somaResultDados() {
		return  dado1 +  dado2 +   dado3 +  dado4 +  dado5;
	}
}
