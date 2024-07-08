/*

1 1 1 1 1 1 
1     1   1 
1   1   1 1 
1 1       1 
1 1 1 1 1 1 

*/

public class NumPat4 {
    public static void main(String[] args) {
        printPattern();
    }

    public static void printPattern() {
        int rows = 5;
        int cols = 6;  // Number of columns to match the pattern width

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows-1  || j == 0 || j == cols-1  || j == cols - i - 2 || 
                    (i==3 && j==4) || (i==2 && j==4)){
                    System.out.print("1 ");
                    if(j==5 && i==0){
                    System.out.print(" ");
                }
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
