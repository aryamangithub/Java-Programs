import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        System.out.println("EN20CS302009 Aryaman Singh Chandrawat");
        Scanner ob = new Scanner(System.in);
        double a = ob.nextDouble();
        double b = ob.nextDouble();
        ob.close();
        System.out.println("Addition of a and b : "+(a+b));
        System.out.println("Subtraction of a and b : "+(a-b));
        System.out.println("Multiplication of a and b : "+(a*b));
        System.out.println("Division of a and b : "+(a/b));

    }
}
