import java.util.Scanner;
public class PrimeNumbers {
    public static boolean checkPrime(int num)
    {
        if(num<2)
        {
            return false;
        }
        else 
        {
            int x=num/2;
            for(int i=2; i<x; i++)
            {
                if(num%i==0)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
       System.out.println("EN20CS302009 Aryaman Singh Chandrawat");
       Scanner ob = new Scanner(System.in);
       System.out.print("Enter the number :");
       int num = ob.nextInt();
       ob.close();
       boolean flag=false;
       if(num==0||num==1)
       {
           System.out.println("Given number is not prime number.");
       } 
       for(int i=2;i<=num/2;i++)
       {
           if(num%i==0)
           {
               flag = true;
           }
       }
       if(flag==false)
       {
           System.out.println("Given number is prime number.");
       }
       else
       { System.out.println("Given number is not prime number.");
       }
       System.out.println("Prime numbers between 1 to 100 are :");
       for(int i=1; i<=100; i++)
       {
           if(checkPrime(i))
           {
               System.out.print(i+" ");
           }
       }
    }
}
