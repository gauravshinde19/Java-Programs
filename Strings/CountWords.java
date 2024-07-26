/*
    Program to accept string from the user and count all the words from the given string
*/

import java.util.*;

class Strings
{
    public static int CountWords(String str)
    {
        str = str.trim();
        
        str = str.replaceAll("\\s+"," ");

        String Arr[] = str.split(" ");

        return Arr.length;
    }
}

class CountWords
{
   public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        int iRet = 0;

        iRet = Strings.CountWords(str);
        System.out.println("Number of words are : " + iRet);

        sobj.close();
    }
}
