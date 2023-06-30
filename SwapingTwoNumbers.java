import java.util.Scanner;

public class SwapingTwoNumbers {
    public static void main(String[] args) {
        System.out.println("EN20CS302009 Aryaman Singh Chandrawat");
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter first  number :");
        int num1 = sc.nextInt();
        System.out.print("Enter second  number :");
        int num2 = sc.nextInt();
        System.out.println("Before swaping number1 ="+num1+" and number2 ="+num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After swaping number1 ="+num1+" and number2 ="+num2);
        sc.close();
    }
}
