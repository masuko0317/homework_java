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
		System.out.println("9:プログラムを終了");
		System.out.println("コードを入力してください。");
		
		int[] coordinate ;
		
		
		while (true) {
			
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			
				if(num == 0) {	
					coordinate = RobotWalk.getCoordinate();
					System.out.println("(" + coordinate[0] + "," + coordinate[1] + ")");
					continue;
				}else if(num == 1) {
					RobotWalk.north(1);
					continue;
				}else if(num == 2) {
					RobotWalk.south(1);
					continue;
				}else if(num == 3) {
					RobotWalk.east(1);
					continue;
				}else if(num == 4) {
					RobotWalk.west(1);
					continue;
				}else if (num == 9) {
					System.out.println("プログラムを終了しました。");
					scan.close();
					break;
				}else {
					System.out.println("有効な数字を入力してください。");	
					continue;
				}
			}
		}
	}