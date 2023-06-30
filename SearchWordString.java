public class SearchWordString {
    public static void main(String[] args) {
        String str = "How to search a word in a string";
        int index = str.indexOf("word");
        if (index ==-1)
        {
            System.out.println("Word not found");
        }
        else {
            System.out.println("Word found at index :"+index);
        }
    }
}
