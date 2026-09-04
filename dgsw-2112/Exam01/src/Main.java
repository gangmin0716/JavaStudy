import java.sql.SQLOutput;
import java.util.Optional;
import java.util.SimpleTimeZone;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    static String getName() {
        return null;
    }
    static String getDefaultName(){
        return "기본 이름";
    }
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable(getName());
        String s01 = name.orElse("이름없음");
        System.out.println(s01);

        Optional<String> name2 = Optional.ofNullable(getDefaultName());
        String s2 = name2.orElse("이름없음");
        System.out.println(s2);
        /***---------------------------------------------*/

        String s3 = name.orElseGet( () -> getDefaultName() );
        System.out.println("s3: " + s3);
//        /***---------------------------------------------*/
//
//        String s4 = name.orElseThrow(() -> new IllegalArgumentException("이름넣으세요."));
//        System.out.println("s4: " + s4);
//
//        /***---------------------------------------------*/
        Optional<String> ex01 = Optional.of("Hello");
        System.out.println("출력: " + ex01.get());

        /***---------------------------------------------*/

        Optional<Object> empty = Optional.empty();
        System.out.println("empty : " + empty.orElse("빈 값"));
        /***---------------------------------------------*/

        Optional<String> ex03 = Optional.ofNullable(null);
        System.out.println("ex03 : " + ex03.orElse("기본값"));


        /***---------------------------------------------*/

//        (a, b) -> a > b ? a : b

//        (name, i) ->
//            System.out.println(name+"="+i);
//
//        (int x) -> return x*x;
//
//        () -> (int)(Math.random()*6);
    }

    /***
     * Optioncal -> NullPpinterException 처리.
     */
}