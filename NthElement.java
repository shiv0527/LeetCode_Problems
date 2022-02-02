import java.util.Arrays;

//This will show us the Nth largest element from an array after the array is sorted.
public class NthElement {
	    
	    
	    public static int NthElement( int[] array, int n){
	        int length = array.length;
	        Arrays.sort(array);
	        return array[length - n];
	        
	    }

	     public static void main(String []args){
	         int[] array = {5,7,1,3,4,2,9,10,6,8};
	         int n = 10;
	        System.out.println(NthElement(array, n));
	     }
	
}
