import java.util.Optional;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Optional.ofNullable(null).ifPresent(n -> System.out.println(n));

        //----------------------------------------------------

        Optional<String> drink = Optional.ofNullable(null);
        System.out.println(drink.orElse("물"));

        //-------------------------------------------------
        String math = getExamScore("수학");
        Optional<String> math2 = Optional.ofNullable(math);
        System.out.println(math2.orElse("0"));

        //---------------------------------------------------------
        Optional<Object> object = Optional.ofNullable("자바");
        object.ifPresent(v -> System.out.println("값있음"));

        //---------------------------------------------------------
        Optional<String> s01 = Optional.ofNullable("성공"); // 실패 null
        System.out.println(s01.isPresent() ? "로그인 성공" : "로그인 실패");

        //---------------------------------------------------------
        Optional<String> name = Optional.ofNullable("이름");
        System.out.println(name.isPresent() ? "합격: [" + name + "]" : "불합격");


    }
    static String getExamScore(String question) {
        return null;
    }
}

