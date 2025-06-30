package curriculum_B;

import java.util.Scanner;

public class Qes7 {

    // 【概要】複数の生徒の成績を管理し、平均点を計算するプログラム
    // 【詳細】英語・数学・理科・社会の4教科を対象に、生徒ごとの平均、全体の平均、教科ごとの平均を出力する

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // // ユーザー入力用スキャナを用意

        System.out.print("生徒の人数を入力してください: ");
        int studentCount = scanner.nextInt(); // // N人分のデータを取得

        // // 教科名を配列で管理
        String[] subjects = {"英語", "数学", "理科", "社会"};
        int subjectCount = subjects.length;

        int[][] scores = new int[studentCount][subjectCount]; // // 成績を格納する配列

        // 【概要】成績入力処理
        // 【詳細】生徒ごとに4教科分の点数を順番に入力
        for (int i = 0; i < studentCount; i++) {
            System.out.println((i + 1) + "人目の成績を入力してください");
            for (int j = 0; j < subjectCount; j++) {
                System.out.print(subjects[j] + "の点数: ");
                scores[i][j] = scanner.nextInt(); // // 点数を入力
            }
        }

        System.out.println("\n--- 各生徒の平均点 ---");
        // 【概要】各生徒の平均点出力
        for (int i = 0; i < studentCount; i++) {
            int sum = 0;
            for (int j = 0; j < subjectCount; j++) {
                sum += scores[i][j]; // // 教科の点数を合計
            }
            double avg = (double) sum / subjectCount; // // 平均を計算
            System.out.printf("%d人目の平均点：%.2f点%n", i + 1, avg); // // 出力
        }

        System.out.println("\n--- 教科ごとの平均点 ---");
        // 【概要】教科ごとの平均点出力
        for (int j = 0; j < subjectCount; j++) {
            int sum = 0;
            for (int i = 0; i < studentCount; i++) {
                sum += scores[i][j]; // // 各生徒の同じ教科の点数を合計
            }
            double avg = (double) sum / studentCount; // // 平均を計算
            System.out.printf("%sの平均点：%.2f点%n", subjects[j], avg); // // 出力
        }

        System.out.println("\n--- 全体の平均点 ---");
        // 【概要】全体平均点出力
        int total = 0;
        for (int i = 0; i < studentCount; i++) {
            for (int j = 0; j < subjectCount; j++) {
                total += scores[i][j]; // // 全ての点数を合計
            }
        }
        double overallAverage = (double) total / (studentCount * subjectCount); // // 平均を計算
        System.out.printf("全体の平均点：%.2f点%n", overallAverage); // // 出力

        scanner.close(); // // スキャナを閉じる
    }
}
