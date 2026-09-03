package Strings;

import java.util.Scanner;

public class PrintFreqOfCharacter {
    static void main() {
        String inputString;
        char letter;
        int count[] = new int[256];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a i/p string:");
        inputString = sc.nextLine();
        for (int i = 0; i < inputString.length(); i++) {
            count[inputString.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                System.out.println((char) i + " = " + count[i]);
            }
        }
    }
}
