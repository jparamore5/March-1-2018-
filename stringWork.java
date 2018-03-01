package helloworldinfinte;
import java.util.Scanner;

public class stringWork {

public static void main(String[]args) {
	System.out.print("ENTER A WORD!");
	Scanner scan = new Scanner(System.in);
	String word = scan.nextLine();
	System.out.print("ENTER A WORD!");
	System.out.print(lengthAndOdd(word));
	
}


public static String lengthAndOdd(String word) {
if  (word.length()%2==0) {
	return "true";

}else 
	return "false";


}
}
