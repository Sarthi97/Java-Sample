public class MergeArray_19 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[] mergedArray = new int[arr1.length + arr2.length];
        
        // Merging the two arrays
        for (int i = 0; i < arr1.length; i++) {
            mergedArray[i] = arr1[i];
        }
        
        for (int i = 0; i < arr2.length; i++) {
            mergedArray[arr1.length + i] = arr2[i];
        }
        
        // Printing the merged array
        System.out.print("Merged Array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
         
        
    }
    
}
