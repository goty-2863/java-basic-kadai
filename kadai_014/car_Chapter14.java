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
		switch(this.gear) {
		case 1 -> System.out.println( "速度は時速"+this.speed+"kmです" );
		case 2 -> System.out.println( "速度は時速"+this.speed+"kmです" );
		case 3 -> System.out.println( "速度は時速"+this.speed+"kmです" );
		case 4 -> System.out.println( "速度は時速"+this.speed+"kmです" );
		case 5 -> System.out.println( "速度は時速"+this.speed+"kmです" );
		default -> System.out.println( "速度は時速10kmです" );
	}
	}
	
	

	
}
