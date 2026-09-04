//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * 스트림, 자료(자료구조)를 표준화 해서 다루기,.
 * 1. 컬렉션 - Collection (Set, Map, List)
 * 2. 다됨.
 *
 * 생성 --> 중간연산 --> 최종연산
 *
 * 데이터(원본) --> 스트림생성 --> ( 복사본 ) --> 중간중간중간 연산자 --> 최종연산(종료)
 * */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Stream<Integer> intStream = list.stream();
        Stream.of(new String[]{"a", "b", "C"}, "a");
        Stream.of("a");

        List<Student> students = List.of(
                new Student(2, 250, "장강민"),
                new Student(1, 300, "당봉이"),
                new Student(2, 170, "우성민"),
                new Student(1, 370, "변성우"),
                new Student(3, 350, "강장민")
        );
        Stream<Student> stream = students.stream();
        stream.sorted(Comparator.comparing(Student::getBan)
                .thenComparing(Student::getTotalScore)).forEach(System.out::println);
    }
    static class Student {
        private int ban;
        private int totalScore;
        private String name;

        public Student(int ban, int totalScore, String name) {
            this.ban = ban;
            this.totalScore = totalScore;
            this.name = name;
        }

        public int getBan() {
            return ban;
        }

        public int getTotalScore() {
            return totalScore;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return String.format("%d 반 %s ( 총점 : %d)", ban, name, totalScore);
        }
    }
}