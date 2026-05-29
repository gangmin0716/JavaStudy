package handling.ex5;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResouce1 {
    public static void main(String[] args) {

        InputStreamReader isr2 = null;

        try {
            isr2 = new InputStreamReader(System.in);
            char input = (char) isr2.read();
            System.out.println("입력글자 = " + input);

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            if (isr2 != null) {
                try {
                    isr2.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}