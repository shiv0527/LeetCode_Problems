import java.util.Scanner;

public class Fibonacci {

	    public static int fib(int n) {
	    	   if(n==0)
	    	   {
	    		   return 0;
	    		   }
	    	   if(n==1)
	    	   {
	    		   return 1;
	    		   }
	   	
	           int a = 0;
	           int b = 1;
	           int temp = 0;
	           for(int i =2;i<n;i++){
	               temp = b + a;
	               a = b;
	               b = temp;
	           }
	           return a + b;
	            
	    }
	     	
	    //Recursive Approach
	    public static int recFib(int n)  {
	        if(n == 0)
	            return 0;
	        else if(n == 1)
	          return 1;
	       else
	          return recFib(n - 1) + recFib(n - 2);
	    }
	
	 public static void main(String[] args) {
		 	Scanner scan = new Scanner(System.in);
	        System.out.print("Enter a Number:");
	        int n = scan.nextInt();
	        System.out.println("Non-Recursive approach" + fib(n));
	        System.out.println("Recursive approach" + recFib(n));
	 }
	 
	
}
