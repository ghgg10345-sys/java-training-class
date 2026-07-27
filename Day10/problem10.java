public class problem10 {
    problem10() {
        System.out.println("Default Constructor");
    }
    problem10(String name) {
        System.out.println("Student Name = " + name);
    }
    public static void main(String[] args) {
        problem10 obj1 = new problem10();
        problem10 obj2 = new problem10("kavi");
    }
}