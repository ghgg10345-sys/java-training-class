class Animal {
    void eat() {
        System.out.println("Animal is Eating");
    }
}
public class problem01 extends Animal {
    public static void main(String[] args) {
        problem01 obj = new problem01();
        obj.eat();
    }
}