import java.util.Scanner;

public class AddAnElementIntoArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];

		for(int i = 0; i < arr.length/2; i++) {
			arr[i] = i;
		}
		
		System.out.println("Enter the number want to add");
		int indexAdd = sc.nextInt();

		System.out.println("Enter it's position in array, begin with 0");
		int indexPosition = sc.nextInt();

		if (indexPosition < 0 || indexPosition > arr.length) {
			System.out.println("out of array length");
		} else {
			for(int k = arr.length-1; k > indexPosition; k --) {
				int temp = arr[k];
				arr[k] = arr[k-1];
				arr[k-1] = temp;
			}
			arr[indexPosition] = indexAdd;

			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + "\t");
			}
		}
	}

}
