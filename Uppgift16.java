import java.util.Arrays;

public class Uppgift16 {
	public static void main(String[] args) {
	int [] k = Uppgift11.generateArray(10,11,20);
	int [] l = Uppgift11.generateArray(5,6,10);;
	int [] m = mergeArrays(k,l);
	
	Arrays.sort(k);
	Arrays.sort(l);
		
	System.out.print(Arrays.toString(k));
	System.out.println();
	System.out.print(Arrays.toString(l));
	System.out.println();
	System.out.print(Arrays.toString(m));
	}
	
	public static int [ ] mergeArrays( int [ ] a, int [] b) {
		if(a == null ||b == null){
			throw new NullPointerException(" Method was given a null pointer array");
		}
		int [] merge = new int[a.length + b.length];
		
		int Index1 = 0;
		int Index2 = 0;
		
		for(int i = 0; i < merge.length; i++){
			// Looks at a and b and look who has the biggest value where their indexes are pointing.
			// If a is bigger insert a's value and increase its pointer else do it to b.

			if(a[Index1] < b[Index2]){
				
				merge[i] = a[Index1];
				Index1++;
				
			}
			else{
				merge[i] = b[Index2];
				Index2++;
			}
			// If we have reached the end of a or b we instead loop through the rest of the opposite 
			// array and insert their values into our array. and then break out of the loop.

			if(Index1 == a.length){
				for(int j = i + 1; j < merge.length; j++)
					merge[j] = b[Index2++];
				break;
			}
			else if(Index2 == b.length){
				for(int j = i + 1; j < merge.length; j++)
					merge[j] = a[Index1++];
				break;
				
			}
		}
	return merge;
	}
}
