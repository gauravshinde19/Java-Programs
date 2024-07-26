// Program to accept string from user and display all the words from given string

import java.util.*;

class DisplayWords
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        str = str.trim();
        
        str = str.replaceAll("\\s+"," ");

        String Arr[] = str.split(" ");

        int i = 0;

        System.out.println("Words from the string are : ");
        for(String s : Arr)
        {    
            System.out.println(s);
        }
    }
}
