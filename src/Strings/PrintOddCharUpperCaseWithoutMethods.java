package src.Strings;

import java.util.Scanner;

public class PrintOddCharUpperCaseWithoutMethods
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
            char ch=inputString.charAt(i);
            if(ch>='A' && ch<='Z')
                    sb.setCharAt(i, (char) (ch+32));


        }

        System.out.println("new stringg:"+sb);
    }
}
