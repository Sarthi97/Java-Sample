public class MissingValue_21 {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5};
        int [] arr1= {2,3,4,5,6};
        System.out.print("missing value is :- ");
        for (int i=0; i<arr.length;i++){
            boolean found = false;
            for(int j=0; j<arr1.length;j++){
                if(arr[i]==arr1[j]&&i!=j){
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print( +arr[i]);
            }
            
        }
       
    }    
        
}
