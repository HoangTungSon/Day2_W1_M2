import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {

	public static int[] createRandom( int[] arr) {
		Random rd = new Random();
		System.out.println("array include: " );
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100);
			System.out.print(arr[i]+ " ");
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
				
			Scanner scaner = new Scanner(System.in);
			int[] arr = new int[100];
			createRandom(arr);
			
			System.out.println("\nPlease enter a number: ");
			int x = scaner.nextInt();

			try {
				System.out.println("the value of " + x + " là " + arr[x]);
			} catch (IndexOutOfBoundsException e) {
				System.out.println("index out of bound");
			}
			
	}

}
