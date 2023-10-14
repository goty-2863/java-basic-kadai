package kadai_20;

import java.util.HashMap;

public class DictionaryExec_Chapter21 {
	
	public static void main(String[]args) {
	
	Map<String,String> dictionaly = new HashMap<String,String>();//←インスタンス作成？
	
	String[]word = new String[3];{
		
	word[0] = "apple";
	word[1] = "banana";
	word[2] = "grape";
	word[3] = "orange";
	for( int i = 0; i < word.length; i++) {
		if(word[i].equals(dictionaly.key)){
			System.out.println(word+"の意味は"+dictionaly.value);
		}
	}
	}	
	}}
	
	
	
		
	
	
	
	
	
	

