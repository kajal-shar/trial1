import java.util.Scanner;

public class square{
    public static void main(String[] args) {
        

        System.out.print("Enter the size of the square: ");
        

        // Nested loops to print the square pattern
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }

        
    }
}
