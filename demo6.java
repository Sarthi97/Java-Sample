import java.util.Scanner;

public class demo6 {
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number 1: ");
       int x , y ;
       x = sc.nextInt();
         System.out.print("Enter a number 2: ");
         y = sc.nextInt();
         add(x, y);
    }
         public static void add(int a, int b) {
            System.out.println(a + b);
    }
}