import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
       int arr[]=new int[5];
       System.out.println("Enter the values in the array :");
       Scanner ob = new Scanner (System.in);
       for(int i=0;i<5;i++)
       {
           arr[i] = ob.nextInt();
       }
       System.out.println("Values stored in the array is:");
       for(int i=0;i<5;i++)
       {
           System.out.println(arr[i]);
       }
       ob.close();
   } 
}
