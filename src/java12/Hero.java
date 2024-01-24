package java12;

public class Hero extends Character {
	String name = "ミナト";
	int hp = 100;
	
	public Hero () {
		this.name = "勇者";
		this.hp = 100;
		System.out.println("Heroのコンストラクタが動作！");
	}
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("5ポイントのダメージをあたえた！");
	}
	
	public void fireball() {
		System.out.println("炎の玉を発射！");
	}
}
