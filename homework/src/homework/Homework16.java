package homework;

public class Homework16 {
	public static void main(String[] args) {
		
		/*
		 * for分を使い、以下の操作をそれぞれ作成しなさい。 
		 * ・0から10までを表示する。 
		 * ・10から0までを表示する。 
		 * ・1から10までの和を表示する。
		 */
		
		System.out.println("0から10までを表示");
		
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}
		
		
		System.out.println("10から0までを表示");
		
		for (int i = 10; i >= 0; --i) {
			System.out.println(i);
		}
		
		
		System.out.println("1から10までの和を表示");
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(i*(i+1)/2);
		
		}
		
	}
}
