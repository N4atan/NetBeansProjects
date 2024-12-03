/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClonePokemon;

/**
 *
 * @author NATANGABRIELWILDNERD
 */
public class Pokemon implements Criatura{
	private String name;
	private int hp;
	private int forca;
	private int defense;
	private int speed;
	
	public Pokemon(String name, int hp, int forca, int defense, int speed) {
		this.name = name;
		this.hp = hp;
		this.forca = forca;
		this.defense = defense;
		this.speed = speed;
	}
	
	
	public String getName()	{ return this.name;     }
	public int getHp()		{ return this.hp;	       }
	public int getDefense()	{ return this.defense; }
	public int getSpeed()		{ return this.speed;    }
	public int getForca()		{ return this.forca;      }
	
	
	public void setHp(int newHp)		  { this.hp = newHp;		     }
	public void setDefense(int newDefense) { this.defense = newDefense; }
	public void setSpeed(int newSpeed)	  { this.speed = newSpeed;	     }
	
	@Override
	public String toString() {
			return "Pokémon: " + name + "\n" +
				"HP: " + hp + "\n" +
				"Força: " + forca + "\n" +
				"Defesa: " + defense + "\n" +
				"Velocidade: " + speed;
	}
	
	@Override
	public void atacar(Pokemon oponentePokemon){
		int dano = this.getForca() - oponentePokemon.getDefense();
		
		//Pra evitar que o dano seja zero!
		dano = dano < 1 ? 1 : dano;
		
		oponentePokemon.setHp(oponentePokemon.getHp() - dano);
	}
	
	@Override
	public boolean fugir(Pokemon oponentePokemon, int somaResultDados){
		return somaResultDados >= oponentePokemon.getSpeed();
	}
	
	@Override
	public void usarItem(){
		
	}
	
	@Override
	public boolean estaVivo() {
		return this.getHp() > 0;
	}
	
	
}
