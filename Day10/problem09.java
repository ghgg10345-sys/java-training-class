class Student {
    private int id;
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
}
public class problem09 {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setId(101);
        System.out.println("Student ID = " + obj.getId());
    }
}