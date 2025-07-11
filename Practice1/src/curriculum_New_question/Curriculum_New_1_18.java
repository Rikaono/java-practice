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
		        System.out.println();
		    }

		    // Q4
		    public static void add(double a, double b) {
		        System.out.println("小数の和: " + (a + b));
		    }

		    // Q5
		    public static int[] generateRandomNumbers(int count) {
		        Random rand = new Random();
		        int[] results = new int[count];
		        int num = 0;
		        
		        System.out.print("ランダムな値: ");
		        for (int i = 0; i < count; i++) {
		          
		            // 0でない値を取得
		            while (num == 0) {
		                num = rand.nextInt(100) + 1;
		            }
		            results[i] = num;
		            System.out.print(num + " ");
		        }
		        System.out.println();
		        return results;
		    }

		    // Q6
		    public static double calculateAverage(int[] numbers) {
		        double sum = 0;
		        for (int num : numbers) {
		            sum += num;
		        }
		        double average = sum / numbers.length;
		        System.out.println("平均値: " + average);
		        return average;
		    }

		    // Q7
		    public static boolean isGreaterThanOrEqual50(double value) {
		        boolean result = value >= 50;
		        System.out.println("50以上か？: " + result);
		        return result;
		    }

		    public static void main(String[] args) {
		        // Q1
		        printMessage("Hello JavaSE", 11);

		        // Q2
		        multiply(5, 7);

		        // Q3
		        int[] array = {10, 20, 30, 40, 50};
		        printArray(array);

		        // Q4
		        add(5.5, 3.3);

		        // Q5
		        int[] randomNumbers = generateRandomNumbers(5);

		        // Q6
		        double average = calculateAverage(randomNumbers);

		        // Q7
		        isGreaterThanOrEqual50(average);
		    }

	}
