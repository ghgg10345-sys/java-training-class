class Animal {
    void eat() {
        System.out.println("Animal is Eating");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is Barking");
    }
}
public class problem02 extends Dog {
    public static void main(String[] args) {
        problem02 obj = new problem02();
        obj.eat();
        obj.bark();
    }
}