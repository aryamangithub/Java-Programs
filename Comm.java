public class Comm {
    public static void main(String[] args) {
        try
        {
            int x = Integer.parseInt("100");
            int y = Integer.parseInt("20");
            int z=x/y;
            System.out.println("Result :"+z);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
           System.out.println("Provide two numbers :");
        }
        System.out.println("Thanks:");
    }
}
