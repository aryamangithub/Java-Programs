import java.util.*;
public class EvenOdd {
   public static void main(String[] args)
   {
       System.out.println("EN20CS302009 Aryaman Singh Chandrawat");
       Scanner ob = new Scanner(System.in);
       System.out.println("Enter a number :");
       int num = ob.nextInt();
       ob.close();
       if (num%2==0)
       {
           System.out.println("Given number is Even.");
       }
       else System.out.println("Given number is Odd.");
   }
}   
