
public class Perfect_Square {
	
	    public static void PerfectSquare(int num) {
	    	boolean ans = false;
	        if (num == 0 || num == 1){
	        	ans = true;
	        	System.out.print(ans);
	        }
	        for(int i = 2; i <= num/2 ; i++){
	            if (i * i == num){
	            	ans = true;
	            }
	        }
	        System.out.print(ans);
	    }
	    public static void main(String[] args)
	    {
	    	int num = 9;
	    	PerfectSquare(num);
	    	
	    }
	
}
