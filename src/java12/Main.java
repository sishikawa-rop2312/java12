package java12;

public class Main {
	public static void main(String[] args) {
		Matango m = new Matango('A');

		Character h = new Hero();
		Character w = new Wizard();
		
		Character[] characters = { h, w };
		
		for (Character character : characters) {
			if (character instanceof Wizard ) {
				Wizard w2 = (Wizard)character;
				w2.fireball();
			} else {
				character.attack(m);
			}
		}
	}
}
