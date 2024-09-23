package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		// 子クラスのインスタンス生成
		Kato_Chapter18 taro = new KatoTaro_Chapter18();
		Kato_Chapter18 ichiro = new KatoIchiro_Chapter18();
		Kato_Chapter18 hanako = new KatoHanako_Chapter18();
		
		//setGivenNameメソッドを実行
		taro.setGivenName();
		ichiro.setGivenName();
		hanako.setGivenName();
		
		//execlntroduceメソッド実行
		taro.execIntroduce();
		ichiro.execIntroduce();
		hanako.execIntroduce();
			

	}

}
