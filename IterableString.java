public class IterableString {
    public static void main(String[] args) {
        String s = "hello";
        s += "World";
        s += 5;
        
        int sLength = s.length();
        String substr = s.substring(1, 5);
        char c = s.charAt(2);

        if (s.indexOf("hello") != -1) {
            System.out.println("\"hello\" in s");
        }
        for(int i = 0; i < sLength; i++) {
            char letter = c;
            System.out.println(letter);
        }
    }
}