package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();

        data.setValue(10);
        System.out.println(data.getValue());
        data.setValue(20);
        System.out.println(data.getValue());
    }
}
