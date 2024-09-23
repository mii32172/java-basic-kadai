package kadai_018;

abstract public class Kato_Chapter18 {
	//姓を表すフィールド
	public static String familyName ="加藤";
	
	//名を表すフィールド
	public String givenName;
	
	//住所を表すフィールド
	public static String address = "東京都中野区〇×";
	
	//抽象メソッド
	//共通の紹介を出力する
	
	public void commonIntroduce() {
		System.out.println("名前は" + familyName  + givenName + "です");
		System.out.println("住所は" + address +"です");
		
	}
	
	abstract public void eachIntroduce(); //個別の紹介を出力する
	
	public void execIntroduce() {
		//紹介を実行する
		commonIntroduce();
		eachIntroduce();
		
		
	}
	


}
