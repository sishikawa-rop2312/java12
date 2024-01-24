package java12;

public class Wizard extends Character {
	public Wizard () {
		this.name = "魔法使い";
		this.hp = 70;
		System.out.println("Wizardのコンストラクタが動作！");
	}
	
	public void attack(Matango m) {
		System.out.println(this.name + "の魔法攻撃！");
		m.hp -= 5;
		System.out.println("5ポイントのダメージをあたえた！");
	}
	
	public void fireball() {
		System.out.println("炎の玉を発射！");
	}
}
