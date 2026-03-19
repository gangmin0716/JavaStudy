package array;

public class ArrayEx9 {
    public static void main(String[] args) {

        int[][] scores = {
                {85, 70, 90, 95},
                {80, 95, 90, 75},
                {75, 85, 90, 80}
        };

        for (int i = 0; i < scores.length; i++) {
            int sum = 0;

            System.out.print("학생 " + (i + 1) + ": ");

            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + " ");
                sum += scores[i][j];
            }

            double avg = (double) sum / scores[i].length;
            System.out.println("| 평균: " + avg);
        }
    }
}