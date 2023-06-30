import java.util.Scanner;
public class Largest_array {
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
    int largest=arr[0];
    for(int i=1; i<n; i++)
    {
        if(arr[i]>largest)
        {
            largest= arr[i];
        }
    }
    System.out.println("Largest number in the array :"+largest);
    sc.close();
    }
}
