/*

1 1 1 1 1 
1 1 0 0 1 
1 0 1 1 1 
1 0 0 1 1 
1 1 1 0 1 

*/

public class NumPat5 {
    public static void main(String[] args) {
        printPattern();
    }

    public static void printPattern() {
        int rows = 5;
        int cols = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0  || j == 0  || j == cols - 1 ||
                    (i == 1 && j < 2) || (i == 1 && j > 3) ||
                    (i == 2 && j == 0) || (i == 2 && j == 2) || (i == 2 && j == 3) ||
                    (i == 3 && j == 0) || (i == 3 && j > 2) ||
                    (i == 4 && j <= 2) ) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
