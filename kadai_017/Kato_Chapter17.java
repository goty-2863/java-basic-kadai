package kadai_017;

//親クラス
abstract public class Kato_Chapter17 {

	public String familyName = "加藤";
	public String givenName;
	public String address = "東京都中野区〇×";

	public void commonlntroguce() {
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
	}

	abstract public void eachIntroduce();

	public void execIntroduce() {
		this.commonlntroguce();
		this.eachIntroduce();
		System.out.println(" ");
	}

}
