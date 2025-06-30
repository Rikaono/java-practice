package curriculum_B;

import java.util.Random; // // ランダム生成のためのimport
import java.util.Scanner; // // ユーザー入力のためのimport

public class Qes6 {

    // 【概要】商品名ごとにランダムな残り台数を表示する処理
    // 【詳細】商品名をカンマ区切りで受け取り、switch文と三項演算子で処理を分岐する

    public static void main(String[] args) {

        // // Scannerクラスを使ってユーザー入力を取得
        Scanner scanner = new Scanner(System.in); // // 入力用Scannerを作成

        System.out.println("商品名をカンマ区切りで入力してください（例：パソコン,テレビ,その他商品）：");
        String input = scanner.nextLine(); // // 入力を1行取得

        String[] products = input.split("、|,|，"); // // 入力値をカンマなどで分割して配列に変換（全角対応）

        Random rand = new Random(); // // ランダム生成器を作成

        // // 各商品を1つずつ処理
        for (String product : products) {

            product = product.trim(); // // 前後の空白を除去

            // // 三項演算子で出力する台数をランダム生成
            int stock = rand.nextInt(12); // // 0〜11のランダムな在庫数を生成

            // // switch文で商品ごとに分岐処理
            switch (product) {
                case "パソコン":
                case "冷蔵庫":
                case "扇風機":
                case "洗濯機":
                case "加湿器":
                    System.out.println(product + "の残り台数は" + stock + "台です"); // // 在庫数を出力
                    break;
                case "テレビ":
                case "ディスプレイ":
                    System.out.println("テレビの残り台数は" + stock + "台です"); // // ディスプレイもテレビとして出力
                    break;
                default:
                	System.out.println("『" + product + "』は指定の商品ではありません");

            }
        }

        scanner.close(); // // Scannerを閉じる
    }
}

