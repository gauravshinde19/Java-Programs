/*
    Program to accept string from the user and find the largest word and its length
*/

import java.util.*;

class Strings
{
    public static void LargestWordAndLength(String str)
    {
        str = str.trim();
        
        str = str.replaceAll("\\s+"," ");

        String Arr[] = str.split(" ");
        
        int i = 0;
        int iMax = 0;
        String MaxStr = null;

        for(i = 0 ; i < Arr.length; i++)
        {
            if(Arr[i].length() > iMax)
            {
                iMax = Arr[i].length();
                MaxStr = Arr[i];
            }
        }

        System.out.println("Largest word is : " + MaxStr);
        System.out.println("Length of largest word is : " + iMax);
    }
}

class LargestWordAndLength
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        Strings.LargestWordAndLength(str);

        sobj.close();
    }
}
