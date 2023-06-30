import java.util.Scanner;
public class ReverseNumber {
   public static void main(String[] args) {
       System.out.println("EN20CS302009 Aryaman Singh Chandrawat");
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter any number :");
       int num = sc.nextInt();
       int rem, rev=0;
       while(num>0)
       {
        rem = num%10;
        num=num/10;
        rev=rev*10+rem;
       }
       System.out.println("Reversed number :"+rev);
       sc.close();
   }    
}
