package dsa.searching.binarysearch;

public class PeakIndexMountainArrays {
	
    static int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while(s < e) {
            int mid = s + (e-s) /2;

            if(arr[mid] < arr[mid+1]) {
                s = mid + 1;
            }
            else{
                e = mid;
            }
        }
    return s; // or return e;
    }
    
	public static void main(String[] args) {
		int arr[] = {0, 2, 4, 9, 5, 3};
		
		int ans = peakIndexInMountainArray(arr);
		System.out.println(ans);
	}

}
