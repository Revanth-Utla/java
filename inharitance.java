// package inheritance;
 class animal{
        void eat(){
            System.out.println("eating");
        }
    }
    class Dog extends animal {
        void bark(){
            System.out.println("Barking...");
        }
    }
public class inharitance {
   public static void main(String[] args) {
    Dog dog = new Dog();
    dog.eat();
    dog.bark();
   }
}