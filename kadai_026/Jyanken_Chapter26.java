package kadai_015.kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	public  String getMyChoice() {
		Scanner scanner = new Scanner(System.in); // Scannerインスタンスの作成
		
		while (true) {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		String input = scanner.next(); //コマンド画面から文字列の入力を読み取ります
		
		if ((input.equals("r")) || (input.equals("s")) || (input.equals("p"))){
			 return input;  
		} else {
				 System.out.println("入力が正しくありません");
				 continue;
			 }
		}

		}
	
	public String getRandom() {
		String[] challenger = {"r", "s", "p" }; //配列にじゃんけんの手をセット
		
		int c = (int)(Math.floor(Math.random() * 3)); //乱数で対戦相手のじゃんけんの手を選ぶ
		
		return challenger[c]; //じゃんけんを実行するクラスに対戦相手のジャンケンの手を返す
		
	}
		
        public void playGame() {
        	HashMap<String,String> choice = new HashMap<String,String>();
        	choice.put("r","グー");
        	choice.put("s","チョキ");
        	choice.put("p","パー");
        	
        	String me =  this.getMyChoice();
        	String you = this.getRandom();
        	
        	System.out.println("自分の手は" + choice.get(me) +",対戦相手の手は" + choice.get(you));
        	
        	//あいこ
        	if((me.equals("r")) && (you.equals("r")) || (me.equals("s")) && (you.equals("s")) || (me.equals("p")) && (you.equals("p"))) {
        		System.out.println("あいこです");
        	}
        	//自分が勝つ
        	if((me.equals("r")) && (you.equals("s")) || (me.equals("s")) && (you.equals("p")) || (me.equals("p")) && (you.equals("r"))) {
        		System.out.println("自分の勝ちです");
        	}
        	//自分がまける
        		if((me.equals("r")) && (you.equals("p")) || (me.equals("s")) && (you.equals("r")) || (me.equals("p")) && (you.equals("s"))) {
            		System.out.println("自分の負けです");
        		}
        	
	}

}
