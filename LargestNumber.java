import java.util.*;

public class LargestNumber {
    static int Largest_number(int a,int b,int c)
    {
        if(a>=b && a>=c)
        {
            return a;
        }
        else if((b>=c && c>=a)||(b>=a && a>=c))
        {
            return b;
        }
        else return c;
    }
    public static void main(String[] args)
    {
        System.out.println("EN20CS302009 Aryaman Singh Chandrawat");
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter first number :");
        int num1 = sc.nextInt();
        System.out.print("Enter second number :");
        int num2 = sc.nextInt();
        System.out.print("Enter third number :");
        int num3 = sc.nextInt();
        System.out.print("Largest number in given 3 numbers is :"+Largest_number(num1, num2, num3));
        sc.close();
    }
}
