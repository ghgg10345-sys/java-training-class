class Animal {
    void sound() {
        System.out.println("Animals make Sound");
    }
}
class Dog extends Animal {

    void bark() {
        System.out.println("Dog Barks");
    }
}
public class problem03 extends Animal {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.bark();
        problem03 obj = new problem03();
        obj.sound();
    }
}