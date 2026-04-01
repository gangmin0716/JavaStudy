package class1;

public class Class3 {
    public static void main(String[] args) {
        Student0 student01 = new Student0();
        student01.name = "학생1";
        student01.age = 15;
        student01.grade = 90;
        Student0 student02 = new Student0();
        student02.name = "학생2";
        student02.age = 16;
        student02.grade = 80;
        Student0[] student0s = new Student0[2];
        student0s[0] = student01;
        student0s[1] = student02;
        System.out.println("이름: " + student0s[0].name + "나이: " + student0s[0].age + "성적: " + student0s[0].grade);
        System.out.println("이름: " + student0s[1].name + "나이: " + student0s[1].age + "성적: " + student0s[1].grade);
    }
}

