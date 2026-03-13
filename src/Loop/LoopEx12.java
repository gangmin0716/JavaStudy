package Loop;

public class LoopEx12 {
    public static void main(String[] args) {
        int ascii = (int)'A';
        int number = 0;

        for (int i = 3; i > 0; i--){
            for (int j = 0; j < i; j++){
                System.out.print((char) ascii + " ");
                ascii++;
            }
            for (int j = 0; j < 3 - i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}