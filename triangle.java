

public class triangle {
    public static void main(String[] args) {
        

        System.out.print("Enter the  triangle: ");
        

        
        for (int i = 0; i < 8; i++) {
            
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }

    
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println(); 
        }

    
    }
}
