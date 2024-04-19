public class IntegerValue {
    public static int max(int[] m) {
        int maxVal = Integer.MIN_VALUE;
        for(int i = 0; i < m.length; i++) {
            if(m[i] > maxVal) {
                maxVal = m[i];
            }
        }
        return maxVal;
    }
    public static void main(String[] args) {
        int[] num = new int[] {9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(num));
    }
}