package kr.co.helloWorld.javastudy;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = new int[100];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+",");
		}
		System.out.println();
		int n = 5;
		int first = arr[0];
		int last = arr.length;
	//	int result = 0;
		//System.out.println(first);
		//System.out.println(last);
		binary(arr, n, first, last);
	}
	
	public static int binary(int[] arr, int n, int first, int last) {
		int mid = (first+last)/2;
		int count = 0;
		
		if(first > last) {
			return -1;
		}else if(arr[mid] > n) {
			return binary(arr, n, first, mid-1 );
		}else if(arr[mid] < n) {
			return binary(arr, n, first, mid+1 );
		}else if(arr[mid] == n){
			return arr[mid];
		}
		return binary(arr, n, first, last);
		
	}

}
