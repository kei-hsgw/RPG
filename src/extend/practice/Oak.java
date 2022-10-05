package extend.practice;

public class Oak extends Monster {
	
	public Oak(String name, int hp, int offensive) {
		this.name = name;
		this.hp = hp;
		this.offensive = offensive;
	}

	@Override
	void attack(Living target) {
		System.out.println("オークが槍で攻撃！" + target.name + "に" + offensive * Rand.get(offensive) + "のダメージを与えた。");
		target.hp -= offensive * Rand.get(offensive);
	}

}
