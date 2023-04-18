package JavaTest;

public class Largest_and_smallest_number_in_an_array {
	/*public static void main(String args[]) {
		int[] a = { 22, 87, 45, 36, 97};
		
		int MAX = a[0];
		int MIN = a[0];
		
		for(int i = 1;i<=a.length;i++) {
			if(a[i]>MAX) {
				MAX = a[i];
			}if(a[i]<MIN) {
				MIN = a[i];
			}
		}
		
		System.out.println("largest number in an array is :" + MAX);
		System.out.println("smallest number in an array is :" + MIN);
	}*/

	
	 public static void main(String[] args) {
	      int[] arr = { 10, 5, 20, 15, 25 };
	      int largest = arr[0];
	      int smallest = arr[0];
	      for (int i = 1; i < arr.length; i++) {
	         if (arr[i] > largest) {
	            largest = arr[i];
	         }
	         if (arr[i] < smallest) {
	            smallest = arr[i];
	         }
	      }
	      System.out.println("Largest number in the array is: " + largest);
	      System.out.println("Smallest number in the array is: " + smallest);
	   }
}
