package homework22;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		/*
		 * mainクラスはロボットに指示を行うようにします。
		 * 9が入力されるまで繰り返し処理を行うものとします。
		 */
		
		System.out.println("ロボット歩行プログラムへようこそ。");
		System.out.println("以下の中からロボットに指示を出してください。");
		System.out.println("0:現在位置を表示。");
		System.out.println("1:北へ進む。");
		System.out.println("2:東へ進む。");
		System.out.println("3:南へ進む。");
		System.out.println("4:⻄へ進む。");
		System.out.println("9:プログラムを終了 コードを入力してください>");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
	}
}
