/*
    Program to accept string from the user and count the length of each word from the string
*/

import java.util.*;

class Strings
{
    public static void LengthOfWords(String str)
    {
        str = str.trim();
        
        str = str.replaceAll("\\s+"," ");

        String Arr[] = str.split(" ");
        
        int i = 0;
        
        for(i = 0 ; i < Arr.length; i++)
        {
            System.out.println("Length of "+Arr[i]+" is "+Arr[i].length());
        }
    }
}

class LengthOfWords
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        Strings.LengthOfWords(str);

        sobj.close();
    }
}
