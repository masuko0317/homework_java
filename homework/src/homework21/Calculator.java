package homework21;

public class Calculator {
	/*
	• 以下の仕様でCalculator.javaを作成してください。 その際、Main.javaとCalculator.javaは同じフォルダに格納するようにしてくだい。
	
	• setBalanceメソッドを作成。 
		・引数:-balance:int型 
		・戻り値:なし
		・処理内容:引数balanceに値を入れる。 
	
	・depositメソッドを作成
		・引数: -price:int型
		・戻り値:int 
		・処理内容:引数Priceの価格をbalanceに入金する。
		　成功時には戻り値として0、失敗時は戻り値として-1を返却する。 
		
	・paymentメソッドの作成
		・引数: -price:int型
		・戻り値:int 
		・処理内容:引数Priceの価格をbalanceから出金してください。
		　成功時には戻り値として0、失敗時は戻り値として-1を返却する。
		　その際、balanceがマイナスになった場合は、失敗として-1を返却してください。
		
	・getBalanceメソッドを作成。
		・引数:なし
		・戻り値:int 
		・処理内容:現在のbalanceの情報を表示する。
	*/
		static int balance;
		
		public static void setBalance(int price) {
			Calculator.setBalance(10000);
		}
		
		public static int deposit(int price) {
			balance += price;
			int a;
			if(balance >= 0) {
				a = +1;
				
			}else{
				a = -1;
				}
			
			return a;
		}
		
		public static int payment(int price) {
			balance -= price;
			int a;
			if(balance >= 0) {
				a = +1;
			}else {
				a = -1;
			}
			return a;
		}
		
		public static int getBalance() {
			return balance;
		}
		
		
		
}