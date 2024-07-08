/*

   1 1 1     
  1 0 1 1 1   
1 0 0 1 1 0 1 
1 0 1 1 1 0 1 
  1 0 0 1 1   
    1 1 1     

*/
public class NumPat7 {
    public static void main(String[] args) {
        printPattern();
    }

    public static void printPattern() {
        int rows = 6;
        int cols = 7;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Spaces for alignment
                if ((i == 0 && (j < 2 || j > 4)) ||
                    (i == 1 && (j < 1 || j > 5)) ||
                    (i == 4 && (j < 1 || j > 5)) ||
                    (i == 5 && (j < 2 || j > 4))) {
                    System.out.print("  ");
                }
                // Top part of the pattern
                else if (i == 0 || (i == 5 && (j >= 2 && j <= 4))) {
                    System.out.print("1 ");
                }
                // Second row
                else if (i == 1) {
                    if (j == 1 || j == 3 || j == 4 || j == 5) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                }
                // Middle rows with specific pattern
                else if (i == 2) {
                    if (j == 0 || j == 3 || j == 4 || j == 6) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                } else if (i == 3) {
                    if (j == 0 || j == 2 || j == 3 || j == 4 || j == 6) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                } else if (i == 4) {
                    if (j == 1 || j == 4 || j == 5) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                }
            }
            System.out.println();
        }
    }
}
