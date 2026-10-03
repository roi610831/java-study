package Main;

import Hero.Hero;
import cleric.Cleric;
import mob.Matango;

public class Main {
	public static void main(String[] args) {
		
		//勇者を生成（インスタンス化）
		Hero h = new Hero();
		//勇者に初期値を設定
		h.name = "roi";
		h.hp = 100;	
		System.out.println("勇者" + h.name + "が誕生した！");
		
		//お化けキノコAを生成
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		
		//お化けキノコBを生成
		Matango m2 = new Matango();
		m2.hp = 50;
		m2.suffix = 'B';
		
		//聖職者を生成
		Cleric c = new Cleric();
		c.name = "hizuki";
		
		
		//勇者のメソッドを呼び出す
		h.sit(5);
		h.slip();
		h.sit(25);
		m1.run();
		m2.attack();
		h.run();
		
		//聖職者のメソッドを呼び出す
		c.selfAid();
		c.pray(3);
		
		
		
	}
}
