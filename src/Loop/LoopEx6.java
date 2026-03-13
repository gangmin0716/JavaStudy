package Loop;

public class LoopEx6 {
    public static void main(String[] args) {
        for(int i = 0; ; i++) {
            if (i % 2 == 1){
                continue;
            } else if (i > 11) {
                break;
            }
            System.out.println(i);
        }
    }
}
