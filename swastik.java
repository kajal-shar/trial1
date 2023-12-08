
public class swastik {
    public static void main(String[] args) {
        drawSwastik(7);
    }

    static void drawSwastik(int size) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i < size / 2) {
                    if (j < size / 2) {
                        
                        if (i == 0 && j == 0) {
                            System.out.print("  ");
                        } else {
                            System.out.print("* ");
                        }
                    } else if (j == size / 2 || j == size - 1) {
                        
                        System.out.print("* ");
                    } else if (i == 0) {
                        System.out.print(" *");
                    } else {
                        
                        System.out.print("  ");
                    }
                } else if (i == size / 2 || i == size - 1) {
                    
                    System.out.print("* ");
                } else {
                    
                    if (j == 0) {
                        System.out.print("* ");
                    } else if (j <= size / 2 || j == size - 1) {
                        
                        System.out.print("  ");
                    } else {
                        
                        System.out.print("* ");
                    }
                }
            }
            System.out.println();
        }
    }
}
