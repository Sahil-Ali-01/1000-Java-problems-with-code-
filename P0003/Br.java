// util package imported
import java.util.*;

public class Br
{

    public static void main(String[] args) 
    {

        // Scanner class object created to take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an integer: ");

        // Here nextInt() reads integer input from key board
        int digit = sc.nextInt();

        // println() prints the integer inputed by the user
        // After printing cursor goes to next line at the console
        System.out.println("Printing user entered input:" + digit);
    }
}