package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {

    // Q1：文字列と整数を受け取り、連結して出力するメソッド
    public static void printMessage(String message, int version) {
        System.out.println(message + " " + version);
    }

    // Q2：2つの整数を掛け算して結果を出力するメソッド
    public static void multiply(int a, int b) {
        System.out.println("乗算結果: " + (a * b));
    }

    // Q3：渡された整数配列を1つずつ順に出力するメソッド
    public static void printArray(int[] numbers) {
        System.out.print("配列の内容: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println(); // 改行
    }

    // Q4：小数を2つ受け取り、加算結果を出力するオーバーロードメソッド
    public static void add(double a, double b) {
        System.out.println("小数の和: " + (a + b));
    }

    // Q5：ランダムな1〜100の整数を「count」回生成し、配列として返すメソッド
    public static int[] generateRandomNumbers(int count) {
        Random rand = new Random(); // ランダム生成器
        int[] results = new int[count]; // 結果を格納する配列

        System.out.print("ランダムな値: ");
        for (int i = 0; i < count; i++) {
            int num = 0;
            // 0が出ないように、1〜100の範囲になるまでループ
            while (num == 0) {
                num = rand.nextInt(100) + 1; // 1〜100
            }
            results[i] = num;
            System.out.print(num + " ");
        }

        System.out.println(); // 改行
        return results; // 配列を返す
    }

    // Q6：渡された整数配列の平均値（小数点付き）を出力し、返すメソッド
    public static double calculateAverage(int[] numbers) {
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = sum / numbers.length;
        System.out.println("平均値: " + average);
        return average;
    }

    // Q7：平均値が50以上かどうかを判定し、結果を出力＆返却するメソッド
    public static boolean isGreaterThanOrEqual50(double value) {
        boolean result = value >= 50;
        System.out.println("50以上か？: " + result);
        return result;
    }

    // 実行用 main メソッド
    public static void main(String[] args) {
        // Q1: "Hello JavaSE 11" を出力
        printMessage("Hello JavaSE", 11);

        // Q2: 5 × 7 の結果を出力
        multiply(5, 7);

        // Q3: 配列を渡して中身を順に出力
        int[] array = {10, 20, 30, 40, 50};
        printArray(array);

        // Q4: 小数を渡して加算結果を出力（オーバーロードのテスト）
        add(5.5, 3.3);

        // Q5: ランダムに生成された数値の配列を取得＆出力
        int[] randomNumbers = generateRandomNumbers(5);

        // Q6: ランダムな数値配列の平均値を計算＆出力
        double average = calculateAverage(randomNumbers);

        // Q7: 平均が50以上かを判定＆出力
        isGreaterThanOrEqual50(average);
    }
}

