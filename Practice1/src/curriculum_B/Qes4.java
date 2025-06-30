package curriculum_B;
public class Qes4 {
    	 public static void main(String[] args) {  // プログラムの実行開始
    	        System.out.println("課題４");  // 見出し「課題４」を表示
    	        printMultiplicationTable();  // 九九表表示メソッドを呼び出す
    	    }

    	    public static void printMultiplicationTable() {  // 九九表表示メソッド
    	        for (int i = 1; i <= 9; i++) {  // 行（掛けられる数）を1から9まで繰り返す
    	            for (int j = 1; j <= 9; j++) {  // 列（掛ける数）を1から9まで繰り返す
    	                int result = i * j;  // 掛け算の結果を計算する
    	                System.out.printf("%02d ＊ %02d ＝ %02d", i, j, result);  // 指定フォーマットで表示する（0埋め2桁）
    	                if (j != 9) {  // 列が最後でない場合
    	                    System.out.print("  ||  ");  // 区切り「||」を表示する
    	                }
    	            }
    	            System.out.println();  // 行の最後で改行する
    	        }
    }
}