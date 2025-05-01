public class SortingArray_23 {
    public static void BubbleSort(int[] arr) {   // bubble Sorting 
        
        for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                }
            }
        }
        
        
    }
    
    public static void main(String[] args) {
        int[] arr = {5,2,6,1,9};
        BubbleSort(arr);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

