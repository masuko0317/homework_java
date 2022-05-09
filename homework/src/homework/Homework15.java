package homework;

public class Homework15 {
	public static void main(String[] args) {
		
		/*
		 * 月を入力し、その月にあった日数を表示するプログラムを作成しなさい。 (2020年の月とする)
		 * 例) 2月の場合は、29日と表示させること。Switch分を使って対応してください。
		 * ただし、標準入力で月を入力するように。 ただし、1〜12が以外入力された場合はエラー処理をするようにしてください。
		 */
	
		System.out.println("日数を知りたい月を入力してください(2020年)");
		int month = new java.util.Scanner(System.in).nextInt();
		
		switch (month) {
		case 1:
			System.out.println("31日");
			break;
		case 2:
			System.out.println("29日");
			break;
		case 3:
			System.out.println("31日");
			break;
		case 4:
			System.out.println("30日");
			break;
		case 5:
			System.out.println("31日");
			break;
		case 6:
			System.out.println("30日");
			break;
		case 7:
			System.out.println("31日");
			break;
		case 9:
			System.out.println("30日");
			break;
		case 10:
			System.out.println("30日");
			break;
		case 11:
			System.out.println("30日");
			break;
		case 12:
			System.out.println("31日");
			break;
			default:
				System.out.println("エラー");
		}
	}
}
