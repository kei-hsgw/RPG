package extend.practice;

public abstract class Living {

	/** キャラクター名 */
	protected String name;
	/** ヒットポイント */
	protected int hp;
	/** 攻撃力 */
	protected int offensive;
	
	/**
	 * ターゲットに攻撃するメソッド
	 * @param target
	 */
	abstract void attack(Living target);
}
