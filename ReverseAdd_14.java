public class ReverseAdd_14 {
    public static void main(String[] args) {
        int a=121;
        int orignal=a;
        int res=0;
        while (a>0) {
            int digit=a%10;
            res=res*10+digit;
            a=a/10;
        }
        if(orignal==res){

        }
        System.out.println("B");

    }
    
}
