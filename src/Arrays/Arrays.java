package src.Arrays;

import java.util.Scanner;

public class Arrays {
    static void main() {
        // declaration
        int arr[];
        //allocation
        arr = new int[5];

        //initialisation
        int brr[] = {10, 20, 30};


        System.out.println("value at 0 index =" + brr[0]);
        System.out.println("value at 1 index =" + brr[1]);
        System.out.println("value at 2 index =" + brr[2]);


        System.out.println("*** WITH FOR LOOP ****");
        for (int i = 0; i < brr.length; i++) {
            System.out.println("value at " + i + " index =" + brr[i]);

        }

        System.out.println("*** WITH FOR EACH LOOP***");

        for (int val : brr) {
            System.out.println("value  index =" + val);
        }


        //User input
        int crr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = crr.length;

        for (int i = 0; i < n; i++) {
            System.out.println("Provide input fr index:" + i);
            crr[i] = sc.nextInt();
        }

        System.out.println("*** WITH FOR EACH LOOP***");
        int sum = 0;
        for (int val : crr) {
            System.out.println("value  index =" + val);
            sum = sum + val;
        }
        System.out.println("Sum " + sum);
//multiplication

        int ans = 1;
        for (int val : crr) {
            ans = ans * val;
        }

        System.out.println("*** Multiplication of all elements" + ans);


        // max vlaue in teh array

        int max = crr[0];

        for (int i = 0; i < crr.length; i++) {

            if (crr[i] > max) {
                max = crr[i];
            }
        }
        System.out.println("Max value in the array:" + max);

// min vlaue in teh array

        int min = crr[0];

        for (int i = 0; i < crr.length; i++) {
            if (min > crr[i]) {
                min = crr[i];
            }

        }
        System.out.println("Minimun value inteh array:" + min);
    }

}
