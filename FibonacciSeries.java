public class FibonacciSeries {
    public static void main(String[] args) {
        int f=0, s=1 ,t;
        System.out.println("EN20CS302009 Aryaman Singh Chandrawat");
        System.out.println("First 10 terms of Fibonacci series :");
        for(int i=1;i<=10;i++)
        { t=f+s;
          System.out.print(f+" ");
          f=s;
          s=t;
        }
    }
}
