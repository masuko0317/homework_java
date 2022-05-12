package homework;

public class Homework14 {
	public static void main(String[] args) {
		
		/*
		 * 中間試験と、期末試験の点数(それぞれ 0 〜 100 点)を入力し、
		 * 次の条件に従って、合格、不合格を判定するプログラムを作成。 ただし、if文を用いて行うこと。
		 * 両方とも 75 点以上の場合、合格
		 * 合計が 140 点以上の場合、合格
		 * 合計が 100 点以上で、どちらかの試験が 90 点以上であれば合格 
		 * 上記以外は不合格
		 * ただし、標準入力で中間試験、期末試験をの点数を入力するように。 ただし、エラー処理は除外します。
		 */
		
		int exam1 = new java.util.Random().nextInt(100); //中間試験の点数
		int exam2 = new java.util.Random().nextInt(100); //期末試験の点数 
		
		System.out.println("中間試験" +exam1);
		System.out.println("期末試験" +exam2);
		
		
		if (exam1 >= 75 && exam2 >=75) {
			System.out.println("合格");
		}else if ((exam1 + exam2)>=140) {
			System.out.println("合格");	
		}else if (exam1 + exam2 >= 100 && (exam1 >= 90 || exam2 >= 90) == true) {
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}
		
	}

}
