package homework22;

public class RobotWalk {
	
		/*
		 * ・以下の仕様に基づいたクラスをmainとは別に作成してください。
		 *　 ロボットの歩行プログラムを作成してください。
		 * 　最初の位置は、0、0とします。
		 * 
		 *  【機能】
		 * ・北に1歩進むメソッドを作成。
		 * ・南に1歩進むメソッドを作成。
		 * ・東に1歩進むメソッドを作成。
		 * ・⻄に1歩進むメソッドを作成。
		 * ・現在の場所を表示するメソッドを作成
		 */
	static int x = 0;
	static int y = 0;
	static int xy []={x,y};
		
		public static int north(int num) {	
			return y+=1;
		}
		public static int south(int num) {
			return y-=1;
		}			
		public static int east(int num) {	
			return x+=1;
		}			
		public static int west(int num) {
			return x-=1;
		}		
		public static int[] position(int[] num) {
			return num;
		}
	}

