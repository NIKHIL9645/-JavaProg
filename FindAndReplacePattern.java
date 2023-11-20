package DSA_2_0;



public class FindAndReplacePattern {

	static void createMapping(String str) {
		char start='a';
		char[] mapping= {0};

		for (int i = 0; i <= str.length() - 1; i++) {
			if(mapping[i]==0) {
				mapping[i]=start;
				start++;
			}
		}
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		 createMapping("abb");
	}
}
