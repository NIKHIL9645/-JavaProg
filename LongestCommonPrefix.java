package DSA_2_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestCommonPrefix {
	
	//aprroach 2
	    public static String longestCommonPrefix2(String[] strs) {
	        Arrays.sort(strs);
	        /*
//	        System.out.println(strs.length);//3 
//	        System.out.println(strs);
//	        for (String string : strs) {
//				System.out.print(string+" ");
//			}
 
	        */
	        
	        
	        
	        String s1 = strs[0];
	        String s2 = strs[strs.length-1];
//	        String s2 = strs[1];
	        System.out.println( "s2 : "+s2);
	        int i = 0;
	        while(i < s1.length() && i < s2.length()){
	            if(s1.charAt(i) == s2.charAt(i)){	
	                i++;
	            } else {
	                break;
	            }
	        }
	        return s1.substring(0, i);
	    }

	
	
	//lakshay approach
	public static String longestCommonPrefix(List<String> v) {
		String ans = "";
		
		int i = 0;
		
		while (true) {
			
			char curr_ch = 0;
			
			for (String str : v) {
				
				if (i >= str.length()) {
					curr_ch = 0;
					break;
				}
				
				if (curr_ch == 0) {
					
					curr_ch = str.charAt(i);
					
				} else if (str.charAt(i) != curr_ch) {
					
					curr_ch = 0;
					break;
				}
			}
			
			if (curr_ch == 0) {
				break;
			}
			ans += curr_ch;
			i++;
		}
		return ans;
	}

	public static void main(String[] args) {
		String str[]= new String[]{"flkight" ,"flig" ,"flighter"};
		
		String st= longestCommonPrefix2(str);
	
		for (char d : st.toCharArray()) {
			System.out.print(d);
		}
		System.out.println();
		
		
		
		
		
		/*
		  List<String> v = new ArrayList<>();
		v.add("flower");
		v.add("flight");
		v.add("flow");
		
		
		String ans = longestCommonPrefix(v);
		for (char d : ans.toCharArray()) {
			System.out.print(d);
		}
		System.out.println();
		*/
	}
}
