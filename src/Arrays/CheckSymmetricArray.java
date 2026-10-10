package src.Arrays;

import java.util.Scanner;

public class CheckSymmetricArray {

    public  static void main(String[] args)
    {
        int matrix[][]= new int[3][3];

        Scanner scanner= new Scanner(System.in);
        System.out.println("Take I/P for 2-D Matrix");
        System.out.println(" I/P for 2-D Matrix rows");
        int rows=scanner.nextInt();
        System.out.println(" I/P for 2-D Matrix cols");
        int cols=scanner.nextInt();

        for (int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                matrix[i][j]=scanner.nextInt();
            }
        }
        checkSymmetric(matrix,rows,cols);
    }

    private static void checkSymmetric(int[][] matrix,int rows, int cols) {
        int flag=1;
        int transposeMatrix[][]= new int[3][3];
        for (int i = 0; i < rows; i++) {
            for(int j=0;j<cols;j++)
            {
                transposeMatrix[j][i]=matrix[i][j];
            }

        }
        System.out.println("print transpose matrix=");
        for (int i = 0; i < rows; i++) {
            for(int j=0;j<cols;j++)
            {
                System.out.print(transposeMatrix[i][j]);
            }
            System.out.println();
        }
        if(rows==cols)
        {
            for (int i = 0; i < matrix.length; i++) {
                for(int j=0;j<matrix[i].length;j++)
                {
                    if(transposeMatrix[i][j]!=matrix[i][j])
                    {
                        flag=0;
                        break;
                    }
                }

            }
            if (flag==0)
            {
                System.out.println("Matrix is not symmetric");
            }
            else {
                System.out.println("Matrix is  symmetric");
            }
        }else {
            System.out.println("Matrix is not symmetric");
        }
    }


}
