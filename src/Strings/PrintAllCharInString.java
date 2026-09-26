package src.Strings;

import java.util.Scanner;

public class PrintAllCharInString
{
    static void main() {
        String inputString;
        int count=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a i/p string:");
       inputString= sc.nextLine();
        System.out.println("Print each char in the I/P string below:");
        for (int i=0;i<inputString.length();i++)
        {
            System.out.println("-->"+inputString.charAt(i));
            count++;
        }

        System.out.println("length of the string:"+count);
    }
}
