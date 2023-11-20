package DSA_2_0;




public class Anagram {

	
	// 1st and best approach 
	static boolean checkAnagram(String str , String target) {
		
		int frequencyTable[]= new int[256];
		frequencyTable[0]=0;
		
		
		for (int i = 0; i < str.length()-1; i++) {
			frequencyTable[str.charAt(i)]++;
		}
		
		
		for (int i = 0; i < target.length()-1; i++) {
			frequencyTable[target.charAt(i)]--;
		}
		
		
		for (int i = 0; i < frequencyTable.length; i++) {
			if(frequencyTable[i] != 0) {
				return false;
			}
		}
		
		
		
		return true;
	}
	
	public static void main(String[] args) {
		String str="anagram";
		String target="nagaram";
//		  String str="cat";
//	      String target="rat";
	
	boolean checkAnagram = checkAnagram(str,target);
	/*if(checkAnagram) {
		System.out.println("Yes Boss Anagram ");
	}
	else {
		System.out.println("Not Anagram");
	}*/
	
	
	String result= checkAnagram ?" Yes Boss Anagram  " : "Not Anagram";
	System.out.println(result);
	
	
	}
}
