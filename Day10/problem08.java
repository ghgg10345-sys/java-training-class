interface Animal {
    void sound();
}
public class problem08 implements Animal {    public void sound() {
        System.out.println("Dog Barks");
    }
    public static void main(String[] args) {
        problem08 obj = new problem08();
        obj.sound();
    }
}