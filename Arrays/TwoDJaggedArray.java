package Arrays;

public class TwoDJaggedArray {

    static void main() {
        // WHEN COLUMNS ARE VARYING--> JAGGED ARRAY

        int jagged[][] = {{1, 2}, {2, 3, 4}, {4, 5, 6, 7, 8}};
        int rowIndex = jagged.length;
        for (int i = 0; i < rowIndex; i++) {
            int colIndex = jagged[i].length;
            for (int j = 0; j < colIndex; j++) {
                System.out.print(jagged[i][j] + " ");
            }

            System.out.println();
        }
    }

}
