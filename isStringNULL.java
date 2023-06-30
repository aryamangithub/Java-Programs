public class isStringNULL {
    public static void main(String[] args) {
        String str1= "Aryaman Singh";
        if ( str1 == null || str1.length()==0)
        {
            System.out.println("Given string str1 ="+str1+" is NULL");
        }
        else {
            System.out.println("Given string str1 ="+str1+" is not NULL");
        }
    }
}
