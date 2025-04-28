public class Static_22 {
    static void sum(){
        System.out.println("Hello");
        return;
    }
    public static void main(String[] args) {
        sum();
        
    }
}


class NonStatic_22{
    int a=4;public static void main(String[] args)
    {
        NonStatic_22 obj =new NonStatic_22();
        System.out.println(obj.a);

    }
}