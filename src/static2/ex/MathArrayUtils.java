package static2.ex;

public class MathArrayUtils {
    private MathArrayUtils() {

    }

    public static int sum(int[] array) {
        int sum = 0;
        for(int i : array) {
            sum += i;
        }
        return sum;
    }
    public static double average(int[] array) {
        double avg;
        avg = (double) sum(array) / array.length;
        return avg;
    }
    public static int min(int[] array) {
        int min = array[1];
        for(int i : array){
            if (min > i) {
                min = i;
            }
        }
        return min;
    }
    public static int max(int[] array) {

        int max = array[1];
        for(int i : array){
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
}
