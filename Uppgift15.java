import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Uppgift15 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner userInput = new Scanner(System.in);
			
		System.out.print("Enter File Path:");
		String fileName = userInput.next();
			
		userInput.close();
			
		Scanner input = new Scanner(new File(fileName));
			
		int[] characters = new int[255];
			
		while(input.hasNext()){
			String boss = input.next();
			char[] stringChars = boss.toCharArray();
				
			for(int i = 0; i < stringChars.length; i++){
				if( (stringChars[i] >= 65 && stringChars[i] <= 90) || (stringChars[i] >= 97 && stringChars[i] <= 122))
					characters[(int)(stringChars[i])]++;
				}
			}
			
			System.out.println("boks, \tantal, \tfrekv");
			
			int total = 0;
			for(char i = 65; i < 90; i++){
				total = total + characters[i] + characters[i+32];
			}

			for(char i = 65; i < 90; i++)
			{
				
				System.out.println(i + "\t" + (characters[i] + characters[i+32]) + "\t" + 
							((int)(((double)(characters[i] + characters[i+32])))*100/total) + "%");
				
			}
			
			input.close();
		}
	}

