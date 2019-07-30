import java.util.Scanner;

public class Max2DimentionArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Length of array");
		int length = sc.nextInt();
		
		System.out.println("Total objects in 1 array");
		int num = sc.nextInt();
		
		int[][] arr = new int [length][num];
		int max = arr[0][0];
		int index = 0 ;
		int indexInIndex = 0;
		
		
		for(int i =0; i < arr.length; i++) {
			for(int j = 0; j < num; j++) {
				System.out.println("put number into array");
				arr[i][j] = sc.nextInt();
				if(arr[i][j] > max) {
					max = arr[i][j];
					index = i;
					indexInIndex = j;
				}
			}
		}
		
		System.out.println("highest number = " + max + " position at: " + index + " " + indexInIndex);
		
	}

}
