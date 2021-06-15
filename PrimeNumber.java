package Day1.Assignment1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag =0;
		int num = 13;
	
		for (int i = 2; i <num; i++) {
			
			if ((num%i)==0) 
			{
				flag =1;
				break;
			}
			
		}
		
		if (flag ==1) {
			System.out.println("Given Number is not a Prime Number");
		}
		else {
			System.out.println("Given Number is  a Prime Number");
		}
	}

}
