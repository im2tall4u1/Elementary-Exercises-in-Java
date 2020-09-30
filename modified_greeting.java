import java.util.*;

public class modified_greeting {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); //reads string

        if (name.equals("Bob") || name.equals("Alice")) {
            System.out.println("Hello " + name + ".");
        }
        else {
            System.out.println("Input is not Alice or Bob");
        }
    }
}
