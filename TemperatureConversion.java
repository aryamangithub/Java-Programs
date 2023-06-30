import java.util.Scanner;
public class TemperatureConversion {
    public static void main(String[] args)
    {System.out.println("EN20CS302009 Aryaman Singh Chandrawat");
     Scanner sc = new Scanner (System.in);
     System.out.print("Enter the temperature in Fahrenheit :");
     float fahrenheit = sc.nextFloat();
     float celsius = (fahrenheit - 32)*5/9; 
     System.out.print("Converted temperature in Celsius :"+celsius+" Degree Celsius");
     sc.close();
    }
}
