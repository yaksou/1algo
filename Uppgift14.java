import java.util.Arrays;

public class Uppgift14 {
	public static void main(String[] args) {
	int a[] = {1,2,3,4,5};
			
	System.out.println(Arrays.toString(a));
			
	insertValue(a,9,4);
			
	System.out.println(Arrays.toString(a));
	
	int []c = Uppgift11.generateArray(10, 11, 20);
	
	System.out.println(Arrays.toString(c));
	
	insertValue(c,5,4);
	System.out.println(Arrays.toString(c));

	
	}
	public static void insertValue(int[]array, int value, int index){
		for(int i = index-1; i < array.length; i++){
			int b = array[i];
			array[i] = value;
			value = b;
			}
		}
	}

