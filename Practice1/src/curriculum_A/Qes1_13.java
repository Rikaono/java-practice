package curriculum_A;

/*************************************************************
 * 【概要】Javaの基本文法の確認問題（問題1〜13まで）
 * 【詳細】各問題で変数の宣言、初期化、演算、出力などを練習する
 *************************************************************/
public class Qes1_13 {

    /*************************************************************
     * 【概要】mainメソッド：各問題を順番に実行
     * 【詳細】問題1〜13に沿って、変数操作や出力を行う
     *************************************************************/
    public static void main(String[] args) {
        // 問題1：ローカル変数の宣言
        byte b;         // byte型の変数
        short s;        // short型の変数
        int i;          // int型の変数
        long l;         // long型の変数
        float f;        // float型の変数
        double d;       // double型の変数
        char c;         // 1文字を表すchar型
        String str;     // 文字列型
        boolean bool;   // 真偽値型

        // 問題2：変数に値を代入（初期化）
        b = 10;                     // byteに10を代入
        s = 100;                    // shortに100を代入
        i = 1000;                   // intに1000を代入
        l = 10000L;                 // longに10000Lを代入
        f = 9.5f;                   // floatに9.5を代入（f必須）
        d = 10.5;                   // doubleに10.5を代入
        c = 'a';                    // charに'a'を代入
        str = "ハロー";             // Stringに「ハロー」を代入
        bool = true;                // booleanにtrueを代入

        // 問題3：変数の出力
        System.out.println(b);      // byteの出力
        System.out.println(s);      // shortの出力
        System.out.println(i);      // intの出力
        System.out.println(l);      // longの出力
        System.out.println(f);      // floatの出力
        System.out.println(d);      // doubleの出力
        System.out.println(c);      // charの出力
        System.out.println(str);    // Stringの出力
        System.out.println(bool);   // booleanの出力

        // 改行（見やすくするため）
        System.out.println();

        // 問題4：演算や出力の確認
        System.out.println(11110);                         // 数字をそのまま出力
        System.out.println("11110");                       // 文字列として出力

        System.out.println(20 + "       " + 20);           // 数字と文字列の連結出力（スペース含む）

        System.out.println(c + " " + str + " " + bool + "      " + c + " " + str + " " + bool);
        // 変数（文字、文字列、真偽値）を並べて出力

        System.out.println((b + s + i + l) + "     " + (b + s + i + l) + "      数字を全て足す");
        // b〜lの整数をすべて加算して出力

        System.out.println((b * s * i * l) + "  " + (b * s * i * l) + "   小数点以外の数字を全てかける");
        // b〜lの整数をすべて掛け算して出力

        System.out.println((d / 100) + "      " + (d / 100) + "        10.5割る100をする");
        // dを100で割った結果を出力

        System.out.println((b - 100) + "        " + (b - 100) + "          10引く100をする");
        // bから100を引いた結果を出力

        // 改行（見やすくするため）
        System.out.println();

        // 問題5：文字列と数値の結合、数値変換
        String num = "20";                                 // 文字列で20を定義
        int num1 = 23;                                     // 数値で23を定義
        System.out.println("ハローJAVA" + (Integer.parseInt(num) + num1));
        // 文字列を数値に変換して足し算、その結果を文字列と連結して出力

        // 改行（見やすくするため）
        System.out.println();

        // 問題6：個人情報の出力（初期値）
        String name = "山田太郎";                           // 名前を定義
        int age = 18;                                      // 年齢を定義
        double height = 170.5;                             // 身長(cm)を定義
        double weight = 62.2;                              // 体重(kg)を定義
        String food = "寿司";                               // 好きな食べ物を定義

        System.out.println("初めまして" + name + "です");     // 自己紹介文を出力
        System.out.println("年齢は" + age + "歳です");        // 年齢を出力
        System.out.println("身長は" + height + "cmです");     // 身長を出力
        System.out.println("体重は" + weight + "kgです");     // 体重を出力
        System.out.println("好きな食べ物は" + food + "です"); // 好きな食べ物を出力

        // 改行（見やすくするため）
        System.out.println();

        // 問題7：BMIの計算と出力
        double heightInMeters = height / 100;              // 身長をm単位に変換
        double bmi = weight / (heightInMeters * heightInMeters); // BMIを計算（体重 ÷ 身長²）
        System.out.println("BMIは" + String.format("%.2f", bmi) + "です"); // 小数第2位まで表示

        System.out.println("BMIは" + bmi + "です");         // BMIを出力

        // 改行（見やすくするため）
        System.out.println();

        // 問題8：個人情報の更新と出力（2人目）
        name = "鈴木一郎";                                  // 名前を更新
        age = 24;                                          // 年齢を更新
        height = 168.5;                                    // 身長を更新
        weight = 64.2;                                     // 体重を更新
        food = "オムライス";                                // 好きな食べ物を更新

        System.out.println("初めまして" + name + "です");     // 自己紹介文を出力
        System.out.println("年齢は" + age + "歳です");        // 年齢を出力
        System.out.println("身長は" + height + "cmです");     // 身長を出力
        System.out.println("体重は" + weight + "kgです");     // 体重を出力
        System.out.println("好きな食べ物は" + food + "です"); // 好きな食べ物を出力
        System.out.println("BMIは" + bmi + "です");         // BMIを出力
        System.out.println("BMIは" + String.format("%.2f", bmi) + "です"); // 小数第2位まで表示
        
        // 改行（見やすくするため）
        System.out.println();

        // 問題9：年齢・身長・体重を和算して代入、自己紹介文の出力
        int newAge = age + 24;                                  // 年齢の和
        double newHeight = height + 168.5;                      // 身長の和
        double newWeight = weight + 64.2;                       // 体重の和

        System.out.println("初めまして鈴木一郎です");             // 自己紹介文出力
        System.out.println("年齢は" + newAge + "歳です");         // 和算された年齢
        System.out.println("身長は" + newHeight + "cmです");      // 和算された身長
        System.out.println("体重は" + newWeight + "kgです");      // 和算された体重
        System.out.println("好きな食べ物はオムライスです");       // 好きな食べ物はそのまま

        double newHeightM = newHeight / 100;                    // m単位に変換
        double newBmi = newWeight / (newHeightM * newHeightM);  // BMI計算
        System.out.println("BMIは" + newBmi + "です");           // BMI出力
        System.out.println("BMIは" + String.format("%.2f", bmi) + "です"); // 小数第2位まで表示

        // 改行
        System.out.println();

        // 問題10：年齢が25歳以上かの判定（if文を使わない）
        boolean isOver25 = newAge >= 25;                         // 25歳以上か判定
        System.out.println(isOver25);                            // trueまたはfalseを出力

        // 改行
        System.out.println();

        // 問題11：年齢・身長・体重を文字列に変換して連結して出力
        String ageStr = String.valueOf(newAge);                  // 年齢を文字列に変換
        String heightStr = String.valueOf(newHeight);            // 身長を文字列に変換
        String weightStr = String.valueOf(newWeight);            // 体重を文字列に変換
        System.out.println("年齢：" + ageStr + " 身長：" + heightStr + " 体重：" + weightStr);

        // 改行
        System.out.println();

        // 問題12：年齢・身長を整数型に変換して出力
        int ageInt = Integer.parseInt(ageStr);                   // 年齢をintに変換
        int heightInt = (int) Double.parseDouble(heightStr);     // 身長をdouble→intへ変換
        System.out.println("年齢：" + ageInt + " 身長：" + heightInt);
        
        // 改行
        System.out.println();

        // 問題13：25歳以上 または 身長160cm以上かを判定（if文を使わない）
        System.out.println((ageInt >= 25) || (heightInt >= 160));

        // 改行
        System.out.println();

    }
}
