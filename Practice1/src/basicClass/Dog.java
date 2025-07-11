package basicClass;

public class Dog {
	// Q1：動物の名前を格納するためのフィールド（変数）を定義
    String name;  // 例: 「犬」「ネコ」などの名前を保持する変数

    // Q2：動物の数を格納するためのフィールドを定義
    int animalCount;  // 例: 「1匹」「2匹」などの数を保持する変数

    // Q3：nameフィールドに「犬」という文字列を代入するコンストラクタ
    public Dog() {
        this.name = "犬";  // 「this」はこのクラス自身を指す。nameフィールドに「犬」を代入
    }

    // Q4：animalCountフィールドに引数の値を代入するコンストラクタ
    public Dog(int count) {
        this.animalCount = count;  // 引数で受け取った数値をanimalCountフィールドに代入
    }
}
