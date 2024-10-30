import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {
        Out.println("Hello, World!");

        Out.println("Enter the first number:");
        int number1 = In.readInt ();

        Out.println("Enter the second number:");
        int number2 = In.readInt();

        Out.println("Enter the third number:");
        int number3 = In.readInt();

        int maximum = number3;

        if (number1 > maximum) {
            maximum = number1;
        }

        if (number2 > maximum) {
            maximum = number2;
        }

        Out.println("The maximum of these 3 numbers is: " + maximum);        
    }
}
