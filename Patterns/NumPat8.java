/*

1 1 1 1 
1 0 1 1 0 
1 0 0 1 1 
1 0 1 1 0 
 1 1 1 1

*/

public class NumPat8 {
    public static void main(String[] args) {
        printPattern();
    }

    public static void printPattern() {
        int rows = 5;
        int cols = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 && j < cols - 1) {
                    // First row (1 1 1 1)
                    System.out.print("1 ");
                } else if (i == rows - 1 && j > 0) {
                    // Last row (  1 1 1 1) with leading space
                    System.out.print(" 1");
                } else if (i > 0 && i < rows - 1) {
                    // Middle rows
                    if (j == 0) {
                        // First column is always 1
                        System.out.print("1 ");
                    } else if (j == cols - 1) {
                        // Last column alternates between 1 and 0
                        if (i % 2 == 1) {
                            System.out.print("0 ");
                        } else {
                            System.out.print("1 ");
                        }
                    } else if ((i == 1 || i == 3) && (j == 2 || j == 3)) {
                        // Specific pattern for rows 2 and 4
                        System.out.print("1 ");
                    } else if (i == 2 && j == 3) {
                        // Specific pattern for row 3
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
