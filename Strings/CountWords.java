// Program to accept string from the user and count all the words from the given string

import java.util.*;

class CountWords
{
   public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        str = str.trim();
        
        str = str.replaceAll("\\s+"," ");

        String Arr[] = str.split(" ");

        System.out.println("Number of words are : "+Arr.length);
    }
}
