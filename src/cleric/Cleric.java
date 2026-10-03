package cleric;

//聖職者クラス
public class Cleric {

	//聖職者のフィールド（名前、HP、最大HP、MP、最大MP）
	public String name;
	public int hp = 150;
	public final int MAXHP = 150;
	public int mp = 10;
	public final int MAXMP = 10;
	
	//聖職者のメソッド
	
	//セルフエイド（自身HP全回復、消費MP５）
	public void selfAid() {
		this.mp -= 5;
		this.hp = this.MAXHP;
		System.out.println("聖職者"+ this.name + "は、セルフエイドを唱えた！");
		System.out.println(this.name + "のHPが全回復した！");
	}
	
	//祈る(祈った秒数+0～2ポイントのMPを回復)
	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒祈った");
		int r = new java.util.Random().nextInt(3);
		int recoveryAmount = sec + r;
		this.mp = this.mp + recoveryAmount;
		//mpが最大MPよりも高くならないための処理
		if(this.mp >= this.MAXMP) {
			this.mp = this.MAXMP;
			System.out.println(this.name + "のMPは最大！");
		}
		System.out.println(this.name + "は" + recoveryAmount + "ポイントのMPが回復した！");
		return recoveryAmount;
	}
}
