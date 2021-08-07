package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 5;
        long fact = 1;
        int i = 1;
        while(i<=input)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial is: "+fact);
    }
	}


