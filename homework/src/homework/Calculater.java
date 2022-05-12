package homework;

public class Calculater {

	/*
	 * Mainクラス:
	 * scannerを使い、3回数字を入力するようにしてください。 
	 * その後、calculaterクラスの各メソッドを呼んでその結果を表示してください。
	 * 
	 * Calculaterクラス:以下の4つのメソッドを作成してください。
	 * - addメソッド:3つの数字の和を返却するようにしてください。
	 * - maxメソッド:3つの数字の中で一番大きい数字を返却してください。
	 * - minメソッド:3つの数字の中で一番小さい数字を返却してください。
	 */
	
	public static int a(int num1,int num2,int num3) {
		int sum = num1 + num2 + num3;
		return sum;
	}
	public static int b(int num1,int num2,int num3) {
		int max = Math.max(num1,(Math.max(num2, num3)));
		return max;
	}
	public static int c(int num1,int num2,int num3) {
		int min = Math.min(num1,(Math.min(num2, num3))); 
		return min;
	}
		
}
	

