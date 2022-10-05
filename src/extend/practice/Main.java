package extend.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Human> humanList = new ArrayList<Human>();
		humanList.add(new Brave("勇者", 100, 10));
		humanList.add(new Fighter("戦士", 100, 10));
		humanList.add(new Wizard("魔法使い", 100, 10));

		List<Monster> monsterList = new ArrayList<Monster>();
		monsterList.add(new Slime("スライム", 100, 10));
		monsterList.add(new Oak("オーク", 100, 10));
		monsterList.add(new Dragon("ドラゴン", 100, 10));
		
		while (!(humanList.size() == 0) && !(monsterList.size() == 0)) {
			
			// humanListから乱数を取得
			int randHuman = Rand.get(humanList.size());
			Human human = humanList.get(randHuman);
			
			// monsterListから乱数を取得
			int randMonster = Rand.get(monsterList.size());
			Monster monster = monsterList.get(randMonster);
			
			human();
			human.attack(monster);
			if (monster.hp <= 0) {
				System.out.println(monster.name + "が倒れた！");
				monsterList.remove(monster);
			}
			monster();
			monster.attack(human);
			if (human.hp <= 0) {
				System.out.println(human.name + "が倒れた！");
				humanList.remove(human);
			}
		}
		if (humanList.size() == 0) {
			System.out.println("人間たちの勝利！");
		} else if (monsterList.size() == 0) {
			System.out.println("モンスターたちの勝利！");
		}
	}

	public static void human() {
		System.out.println("人間のターン！");
	}

	public static void monster() {
		System.out.println("モンスターのターン！");
	}

}
