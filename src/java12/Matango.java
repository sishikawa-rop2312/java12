package java12;

public class Matango {
	int hp = 50;
	char suffix;
	
	public Matango(char suffix) {
		this.hp = 100;
		this.suffix = suffix;
	}

	public void attack(Character c) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		c.hp -= 10;
	}
}
