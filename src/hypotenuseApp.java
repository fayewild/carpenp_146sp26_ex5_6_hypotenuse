import java.util.Scanner;

/**
 * Should have added this sooner:
 * Credit to GeeksForGeeks for help with code!
 * https://www.geeksforgeeks.org/java/arrays-in-java/
 * @author Faye Carpenter
 */
public class hypotenuseApp {
    // This is the one I'm most nervous about. The word "Hypotenuse" in the 
    // context of Java is horrifying.
    
    /*Init. Phase*/
    // double arg1;
    // double arg2;
    // double hypotenuse;
    public static void main(String[] args){
        /*Processing Phase*/
        Scanner sc = new Scanner(System.in);
        // Solicit user input for Arg1
        System.out.print("Insert side A of the Triangle: ");
        double arg1 = sc.nextDouble();
        sc.nextLine();
        
        // Solicit user input for Arg2
        System.out.print("Insert side B of the Triangle: ");
        double arg2 = sc.nextDouble();
        sc.nextLine();
        
        // Call Hypotenuse Method using Arg1 and Arg2
        double hypo = hypotenuse(arg1, arg2);
        
        /*Termination Phase*/
        // Print Arg1, Arg2, and Hypotenuse
        System.out.print("A traigle with a side A equaling " + arg1 + " and a side B equaling " + arg2 );
        System.out.print(" has a Hypotenuse of " + hypo + ".\n");
     } // end main
   
    /* Hypotenuse Method */
    public static double hypotenuse(double x, double y) {
    
        double z =  Math.hypot(x, y); // Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2))); can also be used
        return z;
    
    } // end hypotenuse method
} // end class 
