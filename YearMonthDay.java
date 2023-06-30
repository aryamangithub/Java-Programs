import java.util.Scanner;
public class YearMonthDay {
    public static void main(String[] args) {
        System.out.println("EN20CS302009 Aryaman Singh Chandrawat");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total Days :");
        int total_Days = sc.nextInt();
        sc.close();
        int year, months, days;
        year = total_Days/365;
        months = (total_Days - year*365)/30;
        days = total_Days - year*365 - months*30;
        System.out.println(total_Days+" Days ="+year+" years "+ months+" months and "+days+" days.");
    }
    
}
