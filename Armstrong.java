package week1.day1;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 153,originalNumber,remainder,result=0;
        originalNumber = input;
        while (originalNumber>0)
        {
            remainder=originalNumber % 10;
            result=(remainder*remainder*remainder)+result;
            originalNumber=originalNumber/10;
        }
        if(result == input)
            System.out.println(input + " is an Armstrong number.");
        else
            System.out.println(input + " is not an Armstrong number.");
    }
	
}

