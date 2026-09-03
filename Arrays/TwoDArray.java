package Arrays;

public class TwoDArray {

    static void main() {
        // declaration & Allocation
        int[][] crr = new int[2][3];

        int[][] brr = {{1, 2}, {2, 3}, {3, 4}};

        int rowlength = brr.length;
        int collength = brr[0].length;// only when no.column is fixed
        System.out.println(" ****  2-D ARRAY *****");
        for (int i = 0; i < rowlength; i++) {
            for (int j = 0; j < collength; j++) {
                System.out.print(
                        +brr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

