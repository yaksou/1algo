import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Uppgift21 {
public static ArrayList<String> nameListSort ( ) 
	
	{
		Scanner name = new Scanner(System.in);
		String person = name.nextLine();
		  
		
		String s="";  
	      try{
	        Scanner scan =new Scanner(new File("lista"));
	      	ArrayList<String> list = new ArrayList<String>();
	      	
	      	list.add(person);
	      	
	      
	         while(scan.hasNextLine()){
	            s = scan.nextLine(); // läser en rad från fil till s
	            list.add(s);
	         
	         }
	         Collections.sort(list); //sort the list A-Z
	         return list;
	      }
	      catch( Exception exp) {
	    	  return null;
	      }
			 
	}
	public static boolean addToList(ArrayList<String> list, String person){
		
		if(!list.contains(person)){
				list.add(person);
				
				Collections.sort(list); //sort the list A-Z
				System.out.println("\n\nSorterad lista:" + "\n"); 
		         for(String names : list) //writes out the whole list "loop".
		         {
	        	 
	        	 System.out.println(names);
		         }
		         return true;
	       
	         }
			else{
					return false;
				}
		}
		public static void main(String []args){
			 
			ArrayList<String> listSorted = nameListSort();
			System.out.println("\n\nSorterad lista:" + "\n"); 
		         for(String names : listSorted) //writes out the whole list "loop".
		         {
		        	 
		        	 System.out.println(names);
		         }
		System.out.println(addToList(nameListSort(),"George\tPrime"));

		System.out.println(addToList(nameListSort(),"Tobias\tFrick"));
		   }
	}

