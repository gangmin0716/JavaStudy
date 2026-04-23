package poly1.basic;

public class HumanMain {
    public static void main(String[] args) {
        Human human1 = new Human("900101-1234567");
        Human human2 = new Student("040404-2123456", "2025001");

        Human[] humans = {human1, human2};
        for (Human h : humans) {
            System.out.println("주민번호: " + h.getResidentId());
            if (h instanceof Student) {
                Student student = (Student) h;
                System.out.println("학생 주민번호: " + student.getResidentId());
                System.out.println("학생 학번: " + student.getStudentId());
                student.study();
            } else if (h instanceof Human) {
                System.out.println("사람 주민번호: " + h.getResidentId());
                h.speak();
            }
            System.out.println();
        }
    }
}
