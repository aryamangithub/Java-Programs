import java.util.Scanner;
public class Employee_salary {  
    public static void main(String[] args) {
          float HRA, DA, GS;
          System.out.println("EN20CS302009 Aryaman Singh Chandrawat");
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the Basic salary :");
          int basic_salary = sc.nextInt();
          if(basic_salary<=5000)
          {
              HRA = 20*basic_salary/100;
              DA = 50*basic_salary/100;
              GS = basic_salary + HRA + DA;
              System.out.println("Gross Salary : "+GS+" Rs");
          }
          else if(basic_salary>=5000)
          {
              HRA = 2000;
              DA = 75*basic_salary/100;
              GS = basic_salary + HRA + DA;
              System.out.println("Gross Salary : "+GS+" Rs");
          }
          sc.close();
      }    
}
