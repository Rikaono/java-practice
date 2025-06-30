package curriculum_B;

public class Qes５{
	public static void main(String[] args) {
        System.out.println("課題5");

        for (int i = 1; i <= 20; i++) { // 1から20まで
            for (int j = 1; j <= 9; j++) { // 1から9まで
                // iは2桁、jと結果は3桁表示（ゼロ埋め）
                System.out.printf("%02d * %03d = %03d", i, j, i * j);

                if (j != 9) { // 最後の列以外は区切りをつける
                    System.out.print(" || ");
                }
            }
            System.out.println(); // 改行
        }
    }
}