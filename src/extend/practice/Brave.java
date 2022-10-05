package extend.practice;

public class Brave extends Human {

	public Brave(String name, int hp, int offensive) {
		this.name = name;
		this.hp = hp;
		this.offensive = offensive;
	}

	@Override
	void attack(Living target) {
		System.out.println("勇者が剣で攻撃！" + target.name + "に" + offensive * Rand.get(offensive) + "のダメージを与えた。");
		target.hp -= offensive * Rand.get(offensive);
	}
}
