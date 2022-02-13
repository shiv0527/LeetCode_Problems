import java.util.HashSet;

// This Function returns the length of the Longest substring of a string without repeating the character.
//Leetcode Problem.

public class Longest_Substring {
	  public int lengthOfLongestSubstring(String s) {
		  int front = 0;
		  int end = 0;
		  int length = 0;
		  int size = s.length();
		  
		  HashSet<Character> set = new HashSet<>();
		  for(end = 0; end < size; end++)
		  {  
			  while(set.contains(s.charAt(end))) 
			  {
				  	set.remove(s.charAt(front));
				  	front++;
			  }					
		  
		  set.add(s.charAt(end));
		  int Temp_length = end - front +1;
		  
		  if (Temp_length>length)
			  length=Temp_length;
		  else
			  Temp_length=length;
		  
		  }
		  
		  System.out.print(length);
		  return length;
	    }
	  
public static void main(String[] args) {
	
	String sample = "abcbcadabec";
	//output = 5 as longest substring = "dabec"
	Longest_Substring test =  new Longest_Substring();
	test.lengthOfLongestSubstring(sample);
	
}
}
