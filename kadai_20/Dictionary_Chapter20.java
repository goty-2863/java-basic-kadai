package kadai_20;

import java.util.HashMap;

public class Dictionary_Chapter20 {

	public void reference(String[] words) {

		HashMap<String, String> englishDictionaly = new HashMap<String, String>();

		englishDictionaly.put("apple", "りんご");
		englishDictionaly.put("peacg", "桃");
		englishDictionaly.put("banana", "バナナ");
		englishDictionaly.put("lemon", "レモン");
		englishDictionaly.put("pear", "なし");
		englishDictionaly.put("kiwi", "キウイ");
		englishDictionaly.put("strawberry", "いちご");
		englishDictionaly.put("grape", "ぶどう");
		englishDictionaly.put("muscat", "マスカット");
		englishDictionaly.put("cherry", "さくらんぼ");

		for (String name : words) {
			if (englishDictionaly.containsKey(name)) {
				System.out.println(name + "の意味は" + englishDictionaly.get(name));
			} else {
				System.out.println(name + "は辞書に存在しません");
			}
		}

		//String value = englishDictionaly.get(key);
		//System.out.println(word + "の意味は" + dictionaly.value);
	}
}
