interface Student {
    void displayName();
    void displayRollNo();
    void displayMarks();
}
class CollegeStudent implements Student {
    String name = "vamsi";
    int rollNo = 101;
    int marks = 95;
    public void displayName() {
        System.out.println("Student Name: " + name);
    }
    public void displayRollNo() {
        System.out.println("Roll Number: " + rollNo);
    }
    public void displayMarks() {
        System.out.println("Marks: " + marks);
    }
}
public class Main {
    public static void main(String[] args) {
        CollegeStudent s = new CollegeStudent();
        s.displayName();
        s.displayRollNo();
        s.displayMarks();
    }
}
