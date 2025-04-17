import java.util.Scanner;
                            // Printing Array 
public class Array_1D_15 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the integer");
        int num = n.nextInt();
        System.out.println("Enter arr value");
        int[] arr =new int[num];
        for(int i=0;i<num;i++){
            arr[i]=n.nextInt();
        }
        for (int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}
