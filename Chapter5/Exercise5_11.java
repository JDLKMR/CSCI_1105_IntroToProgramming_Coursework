/*
Jackson Dowse
June 24, 2020

This program lists each number between 100 - 200 that is divisible by either 5 or 6, but not both. A new line is shown after every 10 numbers.
*/

class Exercise5_11 {
	public static void main(String[] args) {
		
		int count = 0;
		int i;
		
		for(i = 100; i <= 200; i++) {
			if(i % 5 == 0 ^ i % 6 == 0) {
				System.out.print(i + " ");
				count ++;
			if(count == 10) {
				System.out.print("\n");
				count = 0;
		}
	}
}

}

}