package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String userName = ""; // ★ ユーザー名はここで宣言しておく

		while (true) {
			System.out.print("ユーザー名を入力してください: ");
			String input = scanner.nextLine();

			if (input == null || input.trim().isEmpty()) {
				System.out.println("名前を入力してください");
			} else if (input.length() > 10) {
				System.out.println("名前を10文字以内にしてください");
			} else if (!input.matches("[a-zA-Z0-9]+")) {
				System.out.println("半角英数字のみで名前を入力してください");
			} else {
				System.out.println("ユーザー名「" + input + "」を登録しました");
				userName = input; // ★ 入力がOKならここで代入する
				break;
			}
		}

		boolean hasWon = false;
		int totalCount = 0;
		Random random = new Random();

		while (!hasWon) {
			totalCount++;

			System.out.print("手を入力してください（0:グー, 1:チョキ, 2:パー）: ");
			int userHand;

			try {
				userHand = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("数字を入力してください。");
				continue;
			}

			if (userHand < 0 || userHand > 2) {
				System.out.println("0、1、2のいずれかを入力してください。");
				continue;
			}

			int opponentHand = random.nextInt(3);

			System.out.println(userName + "の手は「" + handName(userHand) + "」");
			System.out.println("相手の手は「" + handName(opponentHand) + "」");

			int result = judge(userHand, opponentHand);

			if (result == 1) {
				System.out.println("やるやん。");
				System.out.println("次は俺にリベンジさせて");
				hasWon = true;
			} else if (result == -1) {
				System.out.println("俺の勝ち！");
				if (opponentHand == 0) {
					System.out.println("負けは次につながるチャンスです！");
					System.out.println("ネバーギブアップ！");
				} else if (opponentHand == 1) {
					System.out.println("たかがじゃんけん、そう思ってないですか？");
					System.out.println("それやったら次も、俺が勝ちますよ");
				} else if (opponentHand == 2) {
					System.out.println("なんで負けたか、明日まで考えといてください。");
					System.out.println("そしたら何かが見えてくるはずです");
				}
			} else {
				System.out.println("DRAW あいこ もう一回しましょう！");
			}
		}

		System.out.println("勝つまでにかかった合計回数は" + totalCount + "回です");

		scanner.close();
	}

	public static String handName(int hand) {
		if (hand == 0) return "グー";
		if (hand == 1) return "チョキ";
		return "パー";
	}

	public static int judge(int user, int opponent) {
		if (user == opponent) return 0;
		if ((user == 0 && opponent == 1) || (user == 1 && opponent == 2) || (user == 2 && opponent == 0)) {
			return 1;
		} else {
			return -1;
		}
	}
}
