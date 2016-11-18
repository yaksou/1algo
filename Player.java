
import java.util.*;
// kompletera med metoder och variabler som du beh√∂ver 
public class Player
{

   private String name;
   private int bet;
   private ArrayList <int []> lottoraws;
   // rowWins √§r en lista av vilka lottorader som gav vinst.
   private ArrayList <int []> rowWins;
   private ArrayList <Integer> rowCorrect;
   private int gain;
   private int nrOfRaws;
   // wins √§r en lista med hur m√•nga 5,6,7-wins presonen f√•tt.
   private int[] wins = new int[3];

	        
   public Player(String thename)
   {
               
      name=thename;	
      lottoraws=new ArrayList<int []>();
      rowWins=new ArrayList<int[]>();
      rowCorrect=new ArrayList<Integer>();
   
   }
      
   public void addLottoraws( int nr)
   {
      nrOfRaws=nr;
      for( int i=0;i<nrOfRaws;i++)
    	  lottoraws.add(Play.createLottorow(7)); // metoden skapaLottoRad() skall finas Spel klassen
   }
   
   public void addRowWin(int[] a)
   {
	   rowWins.add(a);
   }
   
   public void addRowCorrect(Integer a)
   {
	   rowCorrect.add(a);
   }
  
   public void setBet(int amount)
   {
      bet=amount*nrOfRaws;
   } 
  
   public int getBet()
   {
      return bet;
   }
	
   public ArrayList<int []> getRows()
   {
	   return lottoraws;
   }
   
   public void setWins(int[] a)
   {
	   wins = a;
   }
   
   public int[] getWins()
   {
	   return wins;
   }
   
   public void setGain(int amount)
   {
      gain=amount;
   }
	
   public String getResult()
   {
     // returnerar en string som ineh√•ller spelare namnet, vinst och lotto raderna som har get vinst 
	   
	   String s = "Namn: " + name + "\tSpenderat pÂ lottor " + bet + "kr\tVinst: " + gain + "kr\n Och vann med raderna:";
	   s = s + "\nHan hadde " + wins[2] + "st rader med 7 r‰tt och " + wins[1] + "st med 6 r‰tt och " + wins[0] + "st med 5 r‰tt.";
	   for(int i = 0; i < rowWins.size(); i++)
	   {
		   s = s + "\n" + Arrays.toString(rowWins.get(i)) + " Hadde " + rowCorrect.get(i).toString() + " korrect numbers.";
	   }
	   
      return s;
   }
  
   public String toString()
   {
    // returnerar en String med ineh√•llet i ett Player-objekt
      return "En spelare vid namn " + name + " och vann " + gain + "kronor han spenderade " + bet + "kr" ;
   }
}



