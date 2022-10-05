package extend.practice;

public class Dragon extends Monster {
	
	public Dragon(String name, int hp, int offensive) {
		this.name = name;
		this.hp = hp;
		this.offensive = offensive;
	}

	@Override
	void attack(Living target) {
		System.out.println("ドラゴンが炎で攻撃！" + target.name + "に" + offensive * Rand.get(offensive) + "のダメージを与えた。");
		target.hp -= offensive * Rand.get(offensive);
	}

}
