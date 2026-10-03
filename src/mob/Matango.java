package mob;

//お化けキノコクラス
public class Matango {

	//お化けキノコのフィールド（HP、レベル）
	public int hp;
	public final int LEVEL = 10;
	public char suffix;
	
	//お化けキノコのメソッド
	//逃げる
	public void run() {
		System.out.println("お化けキノコ" + suffix + "は逃げ出した！");		
	}
	
	//攻撃
	public void attack() {
		//勇者にダメージを与える処理を後に記述
		System.out.println("お化けキノコ" + suffix + "は勇者に攻撃した！");
		System.out.println("勇者に20ダメージ！");
	}
	
}
