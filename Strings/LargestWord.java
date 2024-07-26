/*
    Program to accept string from the user and find the largest word from that string
*/

import java.util.*;

class Strings
{
    public static void LargestWord(String str)
    {
        str = str.trim();
        
        str = str.replaceAll("\\s+"," ");

        String Arr[] = str.split(" ");
        
        int i = 0;
        int iMax = 0;
        String LargeStr = null;

        for(i = 0 ; i < Arr.length; i++)
        {
            if(Arr[i].length() > iMax)
            {
                iMax = Arr[i].length();
                LargeStr = Arr[i];
            }
        }

        System.out.println("Largest word : " + LargeStr);
    }
}

class LargestWord
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        Strings.LargestWord(str);
        
        sobj.close();
    }
}
