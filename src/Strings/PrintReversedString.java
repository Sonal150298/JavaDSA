package src.Strings;

import java.util.Scanner;

public class PrintReversedString
{
    static void main() {
        String inputString,reversedString="";
        char letter;
        int count=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a i/p string:");
       inputString= sc.nextLine();
        System.out.println("Print length of the I/P string below:");
        for (int i=inputString.length()-1;i>=0;i--)
        {
            letter=inputString.charAt(i);
            reversedString=reversedString+letter;


        }

        System.out.println("reversed string of the  given string:"+reversedString);
    }
}
