/*

1 1 1 1 1 
1 0 1 1 0 
1 1 0 1 1 
1 0 1 0 1 
1 1 1 1 0 

*/
public class NumPat6 {
    public static void main(String[] args) {
        printPattern();
    }

    public static void printPattern() {
        int rows = 5;
        int cols = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0) {
                    // First row is all 1s
                    System.out.print("1 ");
                } else if (i == 1) {
                    // Second row: 1 0 1 1 0
                    if (j == 0 || j == 2 || j == 3) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                } else if (i == 2) {
                    // Third row: 1 1 0 1 1
                    if (j == 0 || j == 1 || j == 3 || j == 4) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                } else if (i == 3) {
                    // Fourth row: 1 0 1 0 1
                    if (j == 0 || j == 2 || j == 4) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                } else if (i == 4) {
                    // Fifth row: 1 1 1 1 0
                    if (j == 0 || j == 1 || j == 2 || j == 3) {
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
