package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {

	//自分のじゃんけんの手を入力
	public String getMyChoice() {

		System.out.println("自分のじゃんけんの手を入力しましょう");
		//Scannerクラスのオブジェクトを生成する
		Scanner scanner = new Scanner(System.in);

		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");

		//入力した内容を取得する
		String input = scanner.next();

		//入力した内容を出力する
		System.out.println(input);

		//Scannerクラスのオブジェクトをクローズする
		scanner.close();
		return input;
	}

	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		//じゃんけんの手の配列定義
		String[] jamken = { "r", "s", "p" };

		//乱数生成
		int randomNumber = (int) (Math.floor(Math.random() * 3));

		//じゃんけんの手を返却
		return jamken[randomNumber];
	}

	//じゃんけんを行なう
	public void playGame(String MyHand, String cpuHand) {
		HashMap<String, String> jamkenHand = new HashMap<String, String>();
		jamkenHand.put("r", "グー");
		jamkenHand.put("s", "チョキ");
		jamkenHand.put("p", "パー");

		if (jamkenHand.containsKey(MyHand) && jamkenHand.containsKey(cpuHand)) {
			System.out.println("自分の手は" + jamkenHand.get(MyHand) + ",対戦相手の手は" + jamkenHand.get(cpuHand));
			
			if ((MyHand == "r" && cpuHand == "r") || (MyHand == "s" && cpuHand == "s")|| (MyHand == "p" && cpuHand == "p")) {
				System.out.println("あいこです");
			} else if ((MyHand == "r" && cpuHand == "s") || (MyHand == "s" && cpuHand == "p")|| (MyHand == "p" && cpuHand == "r")){
				System.out.println("自分の勝ちです");
			} else if ((MyHand == "r" && cpuHand == "p") || (MyHand == "s" && cpuHand == "r") || (MyHand == "p" && cpuHand == "s")){
				System.out.println("自分の負けです");
			
			}
		}
	}
}
