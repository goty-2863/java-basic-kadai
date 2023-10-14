package kadai024;

public class Jyanken_Chapter24 {
	
	//自分のじゃんけんの手を入力
	public static String getMyChoice() {
		
		 //Scannerクラスのオブジェクトを生成する
	      //Scanner scanner = new Scanner(System.in);
			
	      //入力した内容を取得する
	      //String input= scanner.next();
			
	      //入力した内容を出力する
	      //System.out.println(input);

	      //Scannerクラスのオブジェクトをクローズする
	      //scanner.close();
		
		
		
		return "";
	}
	
	
	//対戦相手のじゃんけんの手を乱数で選ぶ
	//乱数で対戦相手のじゃんけんの手を選ぶ際は、乱数で3未満の数を取得しましょう。取得した3未満の数を
	//floor()メソッドで切り捨て、配列の要素数である0から2を取得します。
	public static String getRandom() {
		double i = 0; 
		String[]number = new String[2];{
			
			number[0] = "1";
			number[1] = "2";
			number[2] = "3";
		  //乱数の範囲で指定した5までの数値を四捨五入して出力する
		double a = Math.random() * 3;
		double x = (Math.floor(a));
		double b = (Math.round(Math.random() * 5));
		 number[i] =  b;
	    return number[i];
		}
	}
	
	
	
	
	
	//じゃんけんを行なう
	public static void playGame(HashMap) {
		if(RR) {
			System.out.println("あいこです");
		}
		else if(RS) {
			System.out.println("自分の勝ちです");
		}
		else if(RP) {
			System.out.println("自分の負けです");
		}
		else if(SR) {
			System.out.println("自分の負けです");
		}
		else if(SS) {
			System.out.println("あいこです");
		}
		else if(SP) {
			System.out.println("自分の勝ちです");
		}
		else if(PR) {
			System.out.println("自分の勝ちです");
		}
		else if(PS) {
			System.out.println("自分の負けです");
		}
		else if(PP) {
			System.out.println("あいこです");
	}
}}
