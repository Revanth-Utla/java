abstract class animal{
    abstract void sound();
    abstract void eat();
    //normal method 
    void sleep(){
        System.out.println("animal is sleeping");
    }
}
class dog extends animal{
    void sound(){
        System.out.println("Barks");
    }
    void eat(){
        System.out.println("dog is eating");
    }
}
// if a class contail atlist one abstract than it is calss abstract class
public class ABSTRACT {
       public static void main(String[] args) {
        dog d = new dog();
        d.sound();
        d.eat();
    }
}
