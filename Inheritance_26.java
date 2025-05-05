// Inheritance_26 
    class Animal{
        void eat(){
            System.out.println("ogjeiuge,0fe9f");
        }
    // Multi level Inheritance   
       }
       class Dog extends Animal{
        void bark(){
            System.out.println("kifivjwcinc");
        }
       }
       class puppy extends Dog{
        void lazy(){
            System.out.println("cutieeeeee");
        }
       }
    
public class Inheritance_26{
    public static void main(String[] args) {
        Animal a= new Animal();
        a.eat();
        Dog obj = new Dog();
        obj.bark();
        puppy obj1 = new puppy();
        obj1.lazy();
    }
} 