// Program to accept two numbers from user and perform addition of that numbers

import java.util.*;

class addition
{
    public static float Sum(float fNo1, float fNo2)
    {
        float fAns = 0.0f;
        fAns = fNo1 + fNo2;
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

        fRet = Sum(fNo1, fNo2);

        System.out.println("Addition :\n" + fRet);
    }
}
