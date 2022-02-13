import java.lang.reflect.Array;

public class Median_of_2_SortedArray {
public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	double median = 0.0;
	int length1 = nums1.length;
	int length2 = nums2.length;
	int Sort_Array[] = new int[length1+length2];
	int itr1 = 0, itr2 = 0,finalitr =0;
	while(itr1<length1 && itr2<length2)
	{
		if(nums1[itr1] < nums2[itr2])
		{
			Sort_Array[finalitr] = nums1[itr1];
			itr1++;
		}
		else
		{
			Sort_Array[finalitr] = nums1[itr2];
			itr2++;
				
		}
		finalitr++;
		while(itr1 < length1)
		{
			Sort_Array[finalitr] = nums1[itr1];
			itr1++;
			finalitr++;
		}
		while(itr2 < length2)
		{
			Sort_Array[finalitr] = nums2[itr2];
			itr2++;
			finalitr++;
		}
		int length = Sort_Array.length;
		if (length%2!=0)
		{
			median = Sort_Array[length/2];
		}
		else 
		{
			median = (double)((Sort_Array[length/2]) + (Sort_Array[(length/2) - 1])) / 2 ;
			
		}
		
		
	}
	System.out.print(median);
	
	return median;
        
    }




public static void main(String args[])
{
	int nums1[] = new int[] {1,2};
	int nums2[] = new int[] {3,4};
	findMedianSortedArrays(nums1, nums2);

}




}
