package week1.day1;

public class LearnContolStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 90;

		if (age < 18) {
			System.out.println("He/She is a minor");
		} else if (age >= 18 && age < 60) {
			System.out.println("He/She a major");
		} else {
			System.out.println("He/She is a senior citizen");
		}
	}

}
