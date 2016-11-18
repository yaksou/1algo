import javax.swing.JOptionPane;

public class Uppgift12 {
//uppgift 1.2
	
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
	
	public static void main(String[] args) {
	// second input
	char[]codeArray;
	// creates an array with the text from the input
	boolean code = false;
	String s =JOptionPane.showInputDialog("Please enter the password");
	//Scanner input = new Scanner(System.in);
	//String code = input.nextLine();
					
	codeArray = s.toCharArray();
	code = passwordCheck(codeArray);
	JOptionPane.showMessageDialog(null, code);
		}
}
