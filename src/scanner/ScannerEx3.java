package scanner;
import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String str = sc.nextLine();

            // str.equals("exit")
            if (str.equals("exit")){
                break;
            }
            System.out.println(str);
        }
    }}
