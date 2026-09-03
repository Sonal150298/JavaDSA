package Strings;

import java.util.Scanner;

public class PrintOddCharUpperCaseIgnoreSpace
{
    static void main() {
        String inputString;
        String letter;
        int count=0;
        String newString="";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a i/p string:");
       inputString= sc.nextLine();
        System.out.println("Print length of the I/P string below:");
        StringBuilder sb= new StringBuilder(inputString);

        for (int i=0;i<inputString.length();i++) {
            if (inputString.charAt(i) != ' ') {
                if (count % 2 == 0) {
                    sb.setCharAt(i, Character.toUpperCase(inputString.charAt(i)));

                }
                count++;
            }
        }

        System.out.println("new stringg:"+sb);
    }
}
