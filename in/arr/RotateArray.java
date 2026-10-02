package in.arr;

public class RotateArray {
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,1};
		int k =2;
		int n =arr.length;
		
		int[]rotated = new int[n];
		for(int i=0;i<n;i++) {
			rotated[(i+k)%n]=arr[i];
			
		}
		System.out.println("Rotated Array");
		for(int num:rotated) {
			System.out.print(num+"");
		}

	}

}
