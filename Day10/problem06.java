class Animal {
    void sound() {
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog Barks");
    }
}
public class problem06 {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
    }
}