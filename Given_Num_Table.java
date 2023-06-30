import java.util.Scanner;
public class Given_Num_Table {
    public static void main(String[] args) {
      System.out.println("EN20CS302009 Aryaman Singh Chandrawat");
      Scanner sc = new Scanner (System.in);
      System.out.print("Enter any number :");
      int num = sc.nextInt();
      for(int i=1; i<=10; i++)
      {
          System.out.println(num+"*"+i+"="+num*i);
      }  
      sc.close();
    }
}
