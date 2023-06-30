import java.util.Scanner;
public class Electricity_bill {
  public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      System.out.println("EN20CS302009 Aryaman Singh Chandrawat");
      System.out.println("Enter the units consumed :");
      int unit = sc.nextInt();
      int bill=0;
      if (unit>=0 && unit <=100)
      {
          bill=200 + 2*unit;
      }
      else if ( unit >=101 && unit <=150)
      {
          bill = 200 + 3*unit;
      }
      else if( unit <=151)
      {
          bill = 200 + 7*unit;
      }
      System.out.print("Electricity Bill : "+bill+" Rs");
      sc.close();
    }  
}
