/*
    Program to accept string from user and display all the words from given string
*/

import java.util.*;

class Strings
{
    public static void DisplayWords(String str)
    {
        str = str.trim();
        
        str = str.replaceAll("\\s+"," ");

        String Arr[] = str.split(" ");

        System.out.println("Words from the string are : ");
        for(String s : Arr)
        {    
            System.out.println(s);
        }
    }
}

class DisplayWords
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        Strings.DisplayWords(str);
        
        sobj.close();
    }
}
