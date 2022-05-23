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
	
	public static int x = 0;
	public static int y = 0;
		
		public static void north(int num) {	
			y+=1;
		} 
		public static void south(int num) {
			y-=1;
		}			
		public static void east(int num) {	
			x+=1;
		}			
		public static void west(int num) {
			x-=1;
		}		
		public static int[] getCoordinate() {
			 int data[] = new int[2];
			    data[0] = x;
			    data[1] = y;
			    return data;
		}
	}

