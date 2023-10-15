package kadai_017;

//実行クラス
public class KatoExec_Chapter17 {
	public static void main(String[] args) {
		//各子クラスのインスタンス生成
		KatoTaro_Chapter017 taro = new KatoTaro_Chapter017();
		KatoHanako_Chapter017 hanako = new KatoHanako_Chapter017();
		KatoIchiro_Chapter017 ichiro = new KatoIchiro_Chapter017();

		taro.setGivenName();
		taro.execIntroduce();
		hanako.setGivenName();
		hanako.execIntroduce();
		ichiro.setGivenName();
		ichiro.execIntroduce();

	}
}
