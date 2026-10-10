package src.Arrays;

import java.util.Scanner;

public class Sum2DArray {
    static void main() {

        int sum=0;
        int a[][]= new int[3][4];
        Scanner scanner=new Scanner(System.in);

        for (int i = 0; i <a.length ; i++) {
            for(int j=0;j<a[i].length;j++)
            {

                System.out.println("Provided value for row-"+i+" column-"+j);
                a[i][j]=scanner.nextInt();
            }

        }

        for (int i = 0; i < a.length; i++) {
            for (int j=0;j<a[i].length;j++)
            {
                sum=sum+a[i][j];
            }
        }

        System.out.println("Sum of array="+sum);
    }
}
