
public class Uppgift11 {
//uppgift 1.1
	public static int[] generateArray(int size, int min, int max){
	int []a = new int [size];
	int count = 0;
	for(int j = min; j <= max; j++){
		a[count]= j;
		count++;
		}
		return a;
	}

	public static void main(String[] args){
	int b [] = generateArray(5,1,5);
	for(int i = 0; i < b.length; i++){
		System.out.print(b[i]);
		}	
	}
}
