
public class minArray {

	public static int minValue (int[] array) {
		 int min = array[0];
		 int index = 0;
		 for (int j = 0; j < array.length; j++) {
		     if (array[j] < min) {
		         min = array[j];
	             index = j;
		     }
		 }
		 return index;
	}
	
	public static void main(String[] args) {

	     int []arr = {4, 12, 7, 8, 8, 6, 9};
	     int index = minValue(arr);
	     System.out.println("The smallest element in the array is: " + arr[index]);
		
	}

}
