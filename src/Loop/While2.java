package Loop;

public class While2 {
    public static void main(String[] args) {
        int a = 0;
        while(a < 10) {
            System.out.println(a + " ");
            a++;
        }

        int b = 10;
        while (b > 0) {
            System.out.println(b + " ");
            b--;
        }

        int c = 0;
        while(true) {
            if (c > 10) {
                break;
            }
            System.out.println(c + " ");
            c++;
        }
    }
}
