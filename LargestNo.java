package DSA_2_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestNo {
	
	static boolean myComp(String a, String b) {
		String s1= a+b;
		String s2= b+a;
		
		return s1.compareTo(s2) > 0;
		
	}

	public static String largestN(List<Integer> nums) {

		List<String> snums = new ArrayList<>();
		
		
		for (int s : nums) {
			
			
			snums.add(Integer.toString(s));
			
		}
		
		Collections.sort(snums,(a,b)-> myComp(a, b) ? -1 : 1);
		
		if(nums.get(0)==0) {
			return "0";
		}
		
		
		String ans="";
		for (String str: snums) {
			ans+=str;
		}
		return ans;
	}

	public static void main(String[] args) {

		   List<Integer> list= Arrays.asList(1,2,3,4,5);   

		  System.out.println( largestN(list));

		
	}
}
