package DSA_2_0;

public class RotateArray {

	public static void main(String[] args) {
		
		int k=2;
		int n=6;
		for(int i=0;i<n;i++) {
			int nas=(k+i)%n;
			System.out.println("ans for i= " +i +" is "+nas);
		}
		
		
		
	}
}
