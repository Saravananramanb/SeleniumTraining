package Day1.Assignment1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 0;
		int number2 = 1;
		int nextNumber;
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println(number1);
			//System.out.print(number1 + " ");
			nextNumber = number1 +number2;
			number1 = number2;
			number2 = nextNumber;
				
		}

	}

}
