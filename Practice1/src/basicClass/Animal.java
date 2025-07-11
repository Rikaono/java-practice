package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 // Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください

        Dog dog1 = new Dog();  // Dogクラスのインスタンスを生成して、変数dog1に代入
        System.out.println("動物の名前: " + dog1.name);  // dog1のnameプロパティ（＝犬の名前）を出力
        

        // Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください

        Dog dog2 = new Dog();  // もう一つのDogインスタンスを作成（同じクラスなので中身は同じでもOK）
        System.out.println("動物の数: " + dog2.animalCount);  // dog2のanimalCountプロパティを出力


        // Q3：現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください

        LocalDateTime now = LocalDateTime.now();  // 現在の日時を取得して変数nowに格納
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");  // 日時の出力形式を指定
        String formattedDate = now.format(formatter);  // フォーマッターで整形した日時を文字列に変換
        System.out.println("現在日時: " + formattedDate);  // 整形済みの日時を出力
	}

}
