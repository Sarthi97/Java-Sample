public class SwapWithTemp_07 {
    public static void main(String[] args) {
        int x = 5, y = 10, temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x + ", y = " + y);
    }
}
