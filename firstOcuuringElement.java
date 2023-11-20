package DSA_2_0;

public class firstOcuuringElement {

	public static  int firstOcc(int arr[],int n,int target) {
		
		int start=0;
		int end=n-1;
		int ans=-1;
		int mid=(start+end)/2;
		
		
		while(start<=end) {
			
			if(arr[mid] ==target) {
				ans=mid;
				end=mid-1;
//				start=mid+1;
			}
			else if(target>arr[mid]) {
				start=mid+1;
			}
			else if(target<arr[mid]) {
				end=mid-1;
			}
			mid=(start+end)/2;
		}
		
		return ans;
		
	}
	public static  int lastOccOcc(int arr[],int n,int target) {
		
		int start=0;
		int end=n-1;
		int ans=-1;
		int mid=(start+end)/2;
		
		
		while(start<=end) {
			
			if(arr[mid] ==target) {
				ans=mid;
				start=mid+1;
			}
			else if(target>arr[mid]) {
				start=mid+1;
			}
			else if(target<arr[mid]) {
				end=mid-1;
			}
		mid=(start+end)/2;
		}
		
		return ans;
		
	}
	
	public static int totalOccurences(int arr[],int n, int target ) {
		
		int ans=0;
		int firstans=firstOcc(arr, n,target);
		int lastans=lastOccOcc(arr, n,target);
		
		System.out.println("FirstOcc: "+firstans);
		System.out.println("lastOcc: "+lastans);
		
		int totalOcc=lastans-firstans+1;
//		int totalOcc=firstans+lastans;// 5   wrong ans 
		
		return totalOcc;
	}
	
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,30,40,50,60};
		int n=7;
		int target=30;
		int firstans=firstOcc(arr, n,target);
		int lastans=lastOccOcc(arr, n,target);
		int totalOcc=totalOccurences(arr, n, target);
		
		System.out.println("TOtal Occurences: " +totalOcc);
		
		if(firstans ==-1) {
			System.out.println("not found");
		}else {
			System.out.println("found  at : "+firstans + " and the element is :  "+arr[firstans]  );
		}
		
		if(lastans ==-1) {
			System.out.println("not found");
		}else {
			System.out.println("found  at : "+lastans +" and the element is :  "+arr[lastans]  );
		}
		
		
		
	}
}
