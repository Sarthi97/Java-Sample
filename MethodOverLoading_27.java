class Parent {
    void sum (int a)
    {
        System.out.println("Main hun Don No." +a);
    }
    void sum (int a ,int b){
        System.out.println(a + b);
    }

}
class MethodOverLoading_27{
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.sum(77);
        obj.sum(97, 97);
        

    }
}
