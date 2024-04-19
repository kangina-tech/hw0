public class StarTree {
    public static void main(String[] args) {
        int height = 5;
        for(int i = 1; i <= height; i++) {
            for(int star = 1; star < i + 1; star++) {
                System.out.print("*");
            }
         System.out.println();
        }
    }
}