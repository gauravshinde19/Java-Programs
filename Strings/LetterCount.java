// Program to accept a string and one letter from user and count the number of times that letter occured in that string

import java.io.*;

class LetterCount
{
    public static int Count(String line, char ch)
    {
        int i = 0;
        int iCnt = 0;

        while (i < line.length())
        {
            if (line.charAt(i) == ch)
            {
                iCnt++;
            }
            i++;
        }

        return iCnt;
    }

    public static void main(String[] args)
    {
        try
        {
            String str = null;
            String letter = null;
            char character = '\0';
            int iRet = 0;

            BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the String in which you want to count letter:");
            str = bobj.readLine();
            
            System.out.println("Enter the letter which you want to count in string:");
            letter = bobj.readLine();

            if (letter.length() > 1)
            {
                System.out.println("Error: Letter must be of 1 character");
                return;
            }

            character = letter.charAt(0);

            iRet = Count(str, character);

            System.out.println("\n" + "Character '" + letter + "' occured " + iRet + " times in string " + str);
        }
        catch(IOException e)
        {}
    }
}
