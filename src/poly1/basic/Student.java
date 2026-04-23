package poly1.basic;

public class Student extends Human{
    private String studentId;
    public Student(String residentId, String studentId) {
        super(residentId);
        this.studentId = studentId;
    }

    public void study() {
        System.out.println("학생이 공부합니다.");
    }
    public String getStudentId() {
        return studentId;
    }
}
