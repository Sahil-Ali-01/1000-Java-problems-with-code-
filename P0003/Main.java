// / util package imported
import java.util.*;

public class Main 
{

    public static void main(String[] args) 
    {

        // Scanner class object created to take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an integer: ");

        // Here nextInt() reads integer input from key board
        int digit = sc.nextInt();

        // print() prints the integer inputed by the user
        // After printing cursor remains at the last of the output text at the console
        // Cursore do not go to next line
        System.out.print("Printing user entered input:" + digit);
    }
}