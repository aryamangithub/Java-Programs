class Test
{
     public static void main(String[] args) {
        String s1= "Hello";
        s1.concat("Bye");
        System.out.println(s1);//String is immutable so only Hello will be printed
        StringBuffer s = new StringBuffer("Hello");
        s.append("Buddy");
        System .out .println(s);//StringBuffer is mutable so HelloBuddy will be printed
    }
}