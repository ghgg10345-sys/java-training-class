abstract class Shape {
    abstract void draw();
}
public class problem07 extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
    public static void main(String[] args) {
    problem07 obj = new problem07();
        obj.draw();
    }
}