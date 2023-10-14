package kadai_017;
//親クラス
   abstract public class kato_Chapter17{
	   
	public String familyName ="加藤";
	public String givenName; // = setGivenName 必要か？
	public String address = "住所は東京都中野区〇×です";
	
	public void commonlntroguce() {
		System.out.println("名前は"+familyName+givenName+"です");
		System.out.println(address);
	}
	abstract public void eachlntroduce();
	
	public void execlntroduce(){//紹介を実行するとは何か？
		
	}
	
	
}
