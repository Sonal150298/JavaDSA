package Strings;

import java.util.Scanner;

public class PrintConsonants
{
    static void main() {
        String inputString;
        char letter;
        int count=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a i/p string:");
       inputString= sc.nextLine();
        System.out.println("Print length of the I/P string below:");
        System.out.print("consonant char in a given string:");
        for (int i=0;i<inputString.length();i++)
        {
            letter=inputString.charAt(i);
           if (!(letter=='A' || letter=='a'||letter=='E'||
                   letter=='e'||letter=='I'||letter=='i'||
                   letter=='O' || letter=='o'||letter=='U'||letter=='u'))
            {
                System.out.print(letter);
                count++;
            }

        }
        System.out.println();
        System.out.println("consonant count in the  given string:"+count);
    }
}
