package homework;

public class Homework17 {
	public static void main(String[] args) {
		
		/*
		 * while分を使い、以下の操作をそれぞれ作成しなさい。 
		 * ・50から100までを表示する。 
		 * ・100から50までを表示する。 
		 * ・50から100までの和を表示する。
		 */
		
		System.out.println("50から100までを表示");
		
		int i = 0;
		
		while (50 + i <= 100)
		{
			System.out.println(50 + i);
			i++;
		}
		//------------------------------------------------
		
		System.out.println("100から50までを表示");
		
		int k = 0;
		
		while (100 + k >= 50)
		{
			System.out.println(100 + k);
			k--;
		}
		//------------------------------------------------
		
		System.out.println("50から100までの和を表示");
		
		int m = 50;
		int n = 0;
		
		while (m <= 100) {
			n +=m++;
		}
		
		System.out.println(+n);
			
	}
}