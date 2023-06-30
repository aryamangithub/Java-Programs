import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("EN20CS302009 Aryaman Singh Chandrawat");
        System.out.println("Enter Principle :");
        int principle = ob.nextInt();
        System.out.println("Enter Interest Rate :");
        float rate = ob.nextFloat();
        System.out.println("Enter Time :");
        int time = ob.nextInt();
        ob.close();
        double SI = (principle*rate*time/100);
        System.out.println("Simple INterest :"+SI);
    }  
}
