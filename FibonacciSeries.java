package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum=0,secondNum=1,sum,range=8;
		System.out.print(firstNum+" "+secondNum);
		for(int i=1;i<range;i++)    
		 {    
		  sum=firstNum+secondNum;  
		  System.out.print(" "+sum);
		  firstNum=secondNum;    
		  secondNum=sum;    
		  
		 }    
		  
		}

	}


