// Program to accept a string from user and update the string by replacing next character

import java.io.*;

class StringUpdate
{
    public static void Update(String Original)
    {
        int i = 0;
        int iCnt = 0;
        char ch = '\0';

        System.out.println("Updated String:");
        while (i < Original.length())
        {
            ch = Original.charAt(iCnt);
            System.out.print(++ch);
            iCnt++;
            i++;
        }
    }

    public static void main(String[] args)
    {
        try
        {
            String str = null;

            BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the String:");
            str = bobj.readLine();

            Update(str);
        }
        catch(IOException e)
        {}
    }
}
