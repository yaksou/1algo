
public class Play {
	
	public static int [] generateArray( int size, int min,	int max) 
	{
		int[] returnArray = new int[size];
		
		// Check if it's possible to fill the array with unique numbers, if not return a null pointer.
		if(size > max-min+1 || size < 0)	
			return null;
		
		for(int i = 0; i < size; i++)
		{
			// Randomize a number within the limits.
			int temp = (int)(Math.random()*(max- min +1) + min);	
			
			// If the array already contains the random number get a new random number and reapet.
			while(find(returnArray,temp))
				temp = (int)(Math.random()*(max- min +1) + min);
		
			// If the number is unique insert the number.
			returnArray[i]=temp;
		}

	return returnArray;
	}
	
	public static boolean find(int[] arr, int x)
	{
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == x) return true;
		}
		return false;
	}

	public static int[] createLottorow (int nr)
	{
		return generateArray( nr, 1, 35);
	}
}
