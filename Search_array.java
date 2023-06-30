import java.util.Scanner;
public class Search_array {
 public static void main(String[] args) {
    System.out.println("EN20CS302009 Aryaman Singh Chandrawat");
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the no of elements in array :");
    int n = sc.nextInt();
    int arr[] = new int [n];
    System.out.print("Enter the values of array :");
    for(int i=0; i<n; i++)
    {
        arr[i] = sc.nextInt();
    }
    System.out.print("Enter the value to be searched in given array :");
    int value = sc.nextInt();
    for(int i=0;i<n;i++)
    {
        if(arr[i]==value)
        {
            System.out.println("Value found in array at position :"+(i+1));
            break;
        }
    }
    sc.close();
 }   
}
