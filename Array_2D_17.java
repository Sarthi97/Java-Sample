public class Array_2D_17 {
    public static void main(String[] args) {
        int [][] arr= {{1,2,3,4,5}, {6,7,8,9,10},};
        int min = arr[0][0];
        int max = arr[0][0];
        int sum=0;
        for (int i=0; i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                sum += arr[i][j];
                if(min>arr[i][j])
                min=arr[i][j];
                if(max<arr[i][j])
                max= arr[i][j];

                System.out.print(arr[i][j]);
            }
            System.out.println(" = Sum of all Values:"+ sum);
            System.out.println(" Minmum Value:" + min);
            System.out.println("Maximum Value:" + max);
            
        }
    }
    
}
