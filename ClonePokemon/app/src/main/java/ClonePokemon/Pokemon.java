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
	private int hpMax;
	
	public Pokemon(String name, int hp, int forca, int defense, int speed) {
		this.name = name;
		this.hp = hp;
		this.hpMax = hp;
		this.forca = forca;
		this.defense = defense;
		this.speed = speed;
	}
	
	
	public String getName()	{ return this.name;     }
	public int getHp()		{ return this.hp;	       }
	public int getHpMax()		{ return this.hpMax;	       }
	public int getDefense()	{ return this.defense; }
	public int getSpeed()		{ return this.speed;    }
	public int getForca()		{ return this.forca;      }
	
	
	public void setHp(int newHp)		  { this.hp = newHp;		     }
	public void setHpMax(int newHpMax)		  { this.hpMax = newHpMax;		     }
	public void setDefense(int newDefense) { this.defense = newDefense; }
	public void setSpeed(int newSpeed)	  { this.speed = newSpeed;	     }
	
	@Override
	public String toString() {
			return "\n| Pokemon: " + name + "\n" +
				"| HP: " + hp + "\n" +
				"| Forca: " + forca + "\n" +
				"| Defesa: " + defense + "\n" +
				"| Velocidade: " + speed + "\n" +
				"|= = = = = = = = = = = = = = = = = =|";
	}
	
	@Override
	public void atacar(Pokemon oponentePokemon){
		int dano = this.getForca() - (oponentePokemon.getDefense() / 4);
		
		// Garante que o dano mínimo seja 1
		if (dano < 1) {
			dano = 1;
		}
				
		oponentePokemon.setHp(oponentePokemon.getHp() - dano);
	}
	
	public void atacar2(Pokemon oponentePokemon){
		int dano = this.getForca() - (oponentePokemon.getDefense() / 2);
		
		// Garante que o dano mínimo seja 1
		if (dano < 1) {
			dano = 1;
		}
				
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
