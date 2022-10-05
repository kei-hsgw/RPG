package extend.practice;

public class Slime extends Monster {
	
	public Slime(String name, int hp, int offensive) {
		this.name = name;
		this.hp = hp;
		this.offensive = offensive;
	}

	@Override
	void attack(Living target) {
		System.out.println("スライムが体当たりで攻撃！" + target.name + "に" + offensive * Rand.get(offensive) + "のダメージを与えた。");
		target.hp -= offensive * Rand.get(offensive);
	}

}
