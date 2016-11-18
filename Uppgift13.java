
public class Uppgift13 {
	public static char[] generatePassword(){
				
	 char []password = new char[(int)(Math.random()*8+5)];
			
	 password[0] = (char)(Math.random()*(90-65+1)+65);
	 for(int i = 1; i <password.length-1; i++){
		 password[i] =(char)(Math.random()*(122-97+1)+97);
				 
		 password[password.length-1] = (char)(Math.random()*(57-48+1)+48);
		 }
		 	return password;
	}
	public static boolean passwordCheck(char[]password){
	boolean answer = false;
	boolean digit = false;
	boolean uppercase = false;
	boolean lowercase = false;
				
	if(password.length >=8 && password.length <=12){
		answer= true;
		}
		else{
			return false;
		}
				
// if answer has a digit
	for(int i = 0; i < password.length; i++){
		if(Character.isDigit(password[i]))
			digit = true;
					
		if(Character.isUpperCase(password[i]))
			uppercase = true;
					
		if(Character.isLowerCase(password[i]))
			lowercase =true;
		
		if(digit && uppercase && lowercase){
			return true;
			}
		}
		return false;
	}
			
	 public static void main(String[] args){
	 char password [] = generatePassword();
	 for(int i = 0; i < password.length; i++){
		 System.out.print(password[i]);
		}
				
		int c = 0;
		for(int i = 0; i < 1000; i++){
			char a [] = generatePassword();
					
			if(passwordCheck(a)){
				c++;
				}
			}
			System.out.println(" Out of 1000 generated passwords "+(int)(100*(double)c/1000)+ " % were valid");
	 	}
}
