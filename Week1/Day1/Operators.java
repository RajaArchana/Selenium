package week1.day1;

public class Operators {
	 // print all the even numbers between 1 and 50
    // main task : find the even numbers  - IF()
    // multiple times : for
	public static void main(String[] args) {
		for (int i = 1; i <=50; i++) {
            if (i%2==0) {
                System.out.println(i);
            }
        }
	}
}
