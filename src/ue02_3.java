import java.util.Scanner;

import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
        double radius = 4.0;
        Scanner input = new Scanner(System.in);

        Out.print("Please enter the x-coordinate: ");
        double x = input.nextDouble();

        Out.print("Please enter the y-coordinate: ");
        double y = input.nextDouble();
        
        double distance = Math.sqrt(x * x + y * y);

        if (distance <= radius) {
            Out.println("The point (" + x + ", " + y + ") is inside the circle.");
        } else {
           Out.println("The point (" + x + ", " + y + ") is outside the circle.");
        }
    }
}
