package Arrays;

import java.util.Scanner;

public class TwoDInputArray {

    static void main() {
        Scanner scanner= new Scanner(System.in);


        int a[][]= new int[3][4];

        for (int i = 0; i <a.length ; i++) {
            for(int j=0;j<a[i].length;j++)
            {

                System.out.println("Provided value for row-"+i+" column-"+j);
                a[i][j]=scanner.nextInt();
            }

        }

        for (int i = 0; i <a.length ; i++) {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+ " ");

            }
            System.out.println();

        }
    }
}
