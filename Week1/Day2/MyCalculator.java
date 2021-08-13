package assignment1;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		System.out.println("In my calculator");
		int add=cal.add(25,15,45);
		System.out.println("addition : "+add);
		int sub=cal.sub(25,15);
		System.out.println("subraction : "+sub);
		double mul=cal.mul(25,15);
		System.out.println("product : "+mul);
		float div=cal.divide(25,15);
		System.out.println("remainder : "+div);
	}

}
