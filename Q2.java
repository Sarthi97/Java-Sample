public class Q2 {
    public static void printEvenNumbersInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int start = 1; // Define the start of the range
        int end = 20;  // Define the end of the range
        printEvenNumbersInRange(start, end);
    }
    
}
