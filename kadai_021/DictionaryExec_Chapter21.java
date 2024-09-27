package kadai_015.kadai_021;


public class DictionaryExec_Chapter21 {
	//辞書クラスをインスタンス化
	public static void main(String[] args) {
	Dictionary_Chapter21 dictionary  = new Dictionary_Chapter21();
	
	//調べる単語の配列を作成
	String[] fruitArray = {"apple", "banana", "grape", "orange"};

	 //辞書で調べる
        dictionary.searchWords(fruitArray);
    }
}

