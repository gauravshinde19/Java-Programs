/*
    Program to accept string from the user and find the length of largest word from that string
*/

import java.util.*;

class LengthOfLargestWord
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
        int iMax = 0;

        for(i = 0 ; i < Arr.length; i++)
        {
            if(Arr[i].length() > iMax)
            {
                iMax = Arr[i].length();
            }
        }

        System.out.println("Length of largest word is : " + iMax);
    }
}
