package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		int x = 30;
		int userAge = 0;
		int serviceCost = 0;
		
		if ( ( x > 9 ) && ( x < 20 ) ) {
			userAge = 10;
			serviceCost = 1000;
		} else if( ( x > 19 ) && ( x < 30 ) ) {
			userAge = 20;
			serviceCost = 2000;
		} else if( ( x > 29 ) && ( x < 40 ) ) {
			userAge = 30;
			serviceCost = 3000;
		} else if( ( x > 39 ) && ( x < 50 ) ) {
			userAge = 40;
			serviceCost = 3000;
		} else if( ( x > 49 ) && ( x < 60 ) ) {
			userAge = 50;
			serviceCost = 4000;
		} else if( ( x > 59 ) && ( x < 70 ) ) {
			userAge = 60;
			serviceCost = 4000;
		} else if( ( x > 69 ) && ( x < 80 ) ) {
			userAge = 70;
			serviceCost = 4000;
		} else if( ( x > 79 ) && ( x < 90 ) ) {
			userAge = 80;
			serviceCost = 5000;
		} else {
			serviceCost = 500;
		}
		switch(userAge) {
		case 10 -> System.out.println(userAge+"代の料金は"+serviceCost+"円");
		case 20 -> System.out.println(userAge+"代の料金は"+serviceCost+"円");
		case 30 -> System.out.println(userAge+"代の料金は"+serviceCost+"円");
		case 40 -> System.out.println(userAge+"代の料金は"+serviceCost+"円");
		case 50 -> System.out.println(userAge+"代の料金は"+serviceCost+"円");
		case 60 -> System.out.println(userAge+"代の料金は"+serviceCost+"円");
		case 70 -> System.out.println(userAge+"代の料金は"+serviceCost+"円");
		case 80 -> System.out.println(userAge+"代の料金は"+serviceCost+"円");
		default -> System.out.println("料金は500円");
		}
		
	}

}
