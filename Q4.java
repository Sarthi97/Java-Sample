class Parent {
    void sum (int a)
    {
        System.out.println("Main hun Don No." +a);
    }
    void sum (int a ,int b){
        System.out.println(a + b);
    }
    void sum (int a ,int b,int c){
    System.out.println(a+b+c);
    }
    void sum (double a ,double b){
        System.out.println(a+b);
    }
}
class Q4{
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.sum(77);
        obj.sum(97, 97);
        obj.sum(97, 97,65);
        obj.sum(59.5, 33);

        

    }
}
