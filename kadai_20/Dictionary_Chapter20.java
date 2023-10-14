package kadai_20;
import java.util.HashMap;

public class Dictionary_Chapter20 {

	public static void main(String[]args) {

	HashMap<String,String> dictionaly = new HashMap<String,String>();
	
	
	dictionaly.put("apple","りんご");
	dictionaly.put("peacg","桃");
	dictionaly.put("banana","バナナ");
	dictionaly.put("lemon","レモン");
	dictionaly.put("pear","なし");
	dictionaly.put("kiwi","キウイ");
	dictionaly.put("strawberry","いちご");
	dictionaly.put("grape","ぶどう");
	dictionaly.put("muscat","マスカット");
	dictionaly.put("cherry","さくらんぼ");
	
	for(String key : dictionaly.keySet()) {
		String value = dictionaly.get(key);
	}
 }}
