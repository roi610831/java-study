package Hero;

//勇者クラス
public class Hero {
	
	//勇者のフィールド（名前、HP）
	public String name;
	public int hp;
	
	//勇者のメソッド
	//攻撃
	public void attack() {
		//敵にダメージを与える処理を後に記述
		
		System.out.println(this.name + "は、攻撃した！");
	}
	
	//眠る
	public void sleep(){
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}
	
	//座る
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "回復した！");
	}
	
	//転ぶ
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("５のダメージ！");
	}
	
	//逃げる
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER‼");
		System.out.println("最終HPは" + this.hp + "でした");
		
	}
}
