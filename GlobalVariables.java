package week1.day1;

public class GlobalVariables {

	public String model = "Moto G";
	public int mobilePrice = 15000;
	public byte mobileWeight = 90;
	public long prodNumber = 1888888888888L;
	public boolean replaceWarrenty = true;

	private void mobileModelDetail() {
		// TODO Auto-generated method stub
		System.out.println("Mobile Modal is " + model);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GlobalVariables obj = new GlobalVariables();
		obj.mobileModelDetail();
		System.out.println(obj.mobilePrice);
		System.out.println(obj.mobileWeight);
		System.out.println(obj.prodNumber);
		System.out.println(obj.replaceWarrenty);

	}

}
