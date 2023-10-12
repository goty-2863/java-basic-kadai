package kadai_014;

public class car_Chapter14 {
	private int gear = 1;
	private int speed = 10;
	
	public void gearChange(int afterGear ) {
		this.gear = afterGear;
		this.speed = speed * afterGear;
	
		System.out.println("ギア１からギア"+this.gear+"に切り替えました" );
		
	}
	
	public void run() {
		System.out.println( "速度は時速"+this.speed+"kmです" );
	}
	
	//ギア1から3に切り替えました
	//速度は時速30kmです

	
}
