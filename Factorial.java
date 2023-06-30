import java.util.Scanner;
public class Factorial{
    public static int fact(int num)
    { 
        if(num==0)
        {
            return 1;
        }
        else 
        return (num*fact(num-1));
    }
    
    public static void main(String[] args)
    {
        System.out.println("EN20CS302009 Aryaman Singh Chandrawat");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Factorial of a given number is:"+fact(n));
    }
}