package week1.day1;

public class WhileConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int r,sum=0;    
		  int n=345;  
		  while(n>0){    
		   r=n%10;   
		   sum=sum+r;    
		   n=n/10;    
		  }    
		    
		   System.out.println("Sum of the number "+sum);    
		}  

	}


