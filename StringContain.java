import java.util.Scanner;
public class StringContain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if(str1.contains(str2))
        {
            System.out.println("String 1 ="+str1+" contains String 2 ="+str2);
        }
        else System.out.println("String 1 ="+str1+" does not contains String 2 ="+str2);
        sc.close();
    }
}
