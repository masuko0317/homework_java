package homework;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
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
		

		Scanner scan = new Scanner(System.in);
		System.out.println("数字を3つ入力してください");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		System.out.println("3つの数字、"+num1 + "、" + num2 + "、" + num3 + "の");
		
		int total = Calculator.a(num1,num2,num3);
		System.out.println("和は " + total);
		
		int max = Calculator.b(num1,num2,num3);
		System.out.println("一番大きい数字は " + max);
		
		int min = Calculator.c(num1,num2,num3);
		System.out.println("一番小さい数字は " + min);
		
		scan.close();
	}
}
