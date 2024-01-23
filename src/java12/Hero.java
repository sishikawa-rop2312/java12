package java12;

public class Hero extends Character {
	String name = "ミナト";
	int hp = 100;
	
	public Hero () {
		System.out.println("Heroのコンストラクタが動作！");
	}
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("5ポイントのダメージをあたえた！");
	}
}
