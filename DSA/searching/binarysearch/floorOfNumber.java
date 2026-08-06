package dsa.searching.binarysearch;

public class floorOfNumber {
	
	static int floorNumber(int[] arr, int t) {
		int s = 0;
		int e = arr.length-1;
		
		while(s<=e) {
			int m = s+(e-s)/2;
			
			if(t == arr[m]) {
				return m;	
			}
			else if( t > arr[m]) {
				s = m+1;
			}
			else {
				e = m-1;
			}
		}
	return e;
	}

	public static void main(String[] args) {
		int[] arr = {2, 4, 8, 16, 18};
		int t = 15;
		
		int ans = floorNumber(arr, t);
		
		System.out.println(ans);
	}

}
