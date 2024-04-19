public class TriangleDrawer {
    public static void drawTriangle(int N) {
        for(int i = 1; i <= N; i++) {
            for(int space = 1; space <= N - i; space++) {
                System.out.print(" ");
            }
            for(int star = 0; star < 2 * i - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        drawTriangle(10);
    }
}
