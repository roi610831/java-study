// ファイル名とpublicクラス名は同じにする（HelloWorld.java ↔ HelloWorld）
public class HelloWorld {

    // プログラムはmainメソッドから始まる
    // 試験ポイント: public static void main(String[] args) の形を正確に覚える
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // 変数の宣言と代入
        String name = "ロイ";
        int level = 1;

        // 文字列と数値を + でつなぐと文字列になる
        System.out.println("勇者" + name + "、レベル" + level + "からスタート！");
    }
}
