public class ProveStringImmutable {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        str1.concat("Everyone");
        System.out.println(str1);
        str1 = str1.concat(str2);
        System.out.println(str1);
    }
}
