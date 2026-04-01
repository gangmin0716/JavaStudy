package class1;

public class Class5 {
    public static void main(String[] args) {
        Student1[] student1s = new Student1[]{
                new Student1("학생1", 15, 90),
                new Student1("학생2", 16, 80)
        };

        for (Student1 stu : student1s) {
            stu.showData();
        }
    }
}
