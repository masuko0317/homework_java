package homework21;
	public class Main {
		public static void main(String[] args) { 
			Calculator t1 = new Calculator();
			
			t1.setBalance(10000); //balance->残高
			t1.deposit(10000); //deposit->預り金
			System.out.println("残高は" + t1.getBalance());
			t1.payment(5000);//payment->支払い
			System.out.println("残高は" + t1.getBalance());
			t1.payment(20000); 
			
			/*
			 * エラー処理を追加してください。(残高がありませんエラーを表示するように作成してください)
			 */	
			
			
	}
}