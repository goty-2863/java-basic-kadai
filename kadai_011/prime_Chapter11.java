package kadai_011;

public class prime_Chapter11 {
	
	public static void main(String[] args) {
		boolean [] primeNumber = new boolean[101];
		
		for( int i = 2; i < primeNumber.length; i++ ) {
			primeNumber[i] = true;
			}
		
		for( int i = 2; i < primeNumber.length; i++ ) {
			if(primeNumber[i]) {
		for( int j = i + 1; j < primeNumber.length; j++) {
			primeNumber[j] = (j % i != 0)&& primeNumber[j];
		}
		}
		}
		
		for(int i = 0; i < primeNumber.length;i++) {
			if(primeNumber[i]) {
				System.out.println(i);
			}
		}
		
		
		}
}

