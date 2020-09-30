import java.util.*;

public class input_greeting {

    /* This program will take an input.
     * This will print the username with a greeting
     */

    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String str= sc.nextLine(); //reads string
        System.out.print("Hello " + str);
    }
}
