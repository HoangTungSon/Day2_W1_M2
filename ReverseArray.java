
public class ReverseArray {

	public static void main(String[] args) {
		
		int[] array = new int[10];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i;
			System.out.print(array[i] + "\t");
		}

		
		for(int j = 0; j<=(array.length)/2; j++) {
			int temp;
			temp = array[j];
			array[j] = array[array.length-1-j];
			array[array.length-1-j] = temp;
		}
		
		System.out.println();
		
		for(int k = 0; k <array.length; k++) {
			System.out.print(array[k] + "\t");
		}
	}

}
