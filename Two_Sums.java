
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sums {

	
	
	    public static void twoSum(int[] nums, int target) {
	        int[] result = new int[2];
	        Map<Integer,Integer> store = new HashMap<Integer,Integer>();
	        for(int i =0; i<nums.length; i++)
	        {
	            if(store.containsKey(target - nums[i]))
	            {
	                result[1] = i;
	                result[0] = store.get(target - nums[i]);
	                //return result;
	                System.out.println(""+ Arrays.toString(result));
	            }
	            store.put(nums[i], i);
	        }
	        	System.out.print("No Such Value");
	    }
	
	    
	    public static void main(String[] args)
	    {
	    	int num[] = {1,2,3,4};
	    	int target = 10;
	    	twoSum(num, target);
	    }
	
}
