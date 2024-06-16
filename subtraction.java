// Program to accept two numbers from user and perform subtraction of that numbers

import java.util.*;

class subtraction
{
    public static float Subt(float fNo1, float fNo2)
    {
        float fAns = 0.0f;
        fAns = fNo1 - fNo2;
        return fAns;
    }

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        float fNo1 = 0.0f;
        float fNo2 = 0.0f;
        float fRet = 0.0f;

        System.out.println("Enter the first number :");
        fNo1 = sobj.nextFloat();

        System.out.println("Enter the second number :");
        fNo2 = sobj.nextFloat();

        fRet = Subt(fNo1, fNo2);

        System.out.println("Subtraction :\n" + fRet);
    }
}
