class Student {
    int rollNo;
    String name;
    static String college = "RISE college";
    Student(int r, String n) {
        rollNo = r;
        name = n;
    }
    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
    public static void main(String[] args) {
        Student s1 = new Student(43, "Ram");
        Student s2 = new Student(93, "Tharish");
        s1.display();
        s2.display();
    }
}