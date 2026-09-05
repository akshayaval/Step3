public class qs4 {

    static double rowAverage(int[] row) {

        int sum = 0;

        for (int num : row) {
            sum += num;
        }

        return (double) sum / row.length;
    }

    static String classifyRows(int[][] seatingScores, int threshold) {

        String result = "";

        for (int i = 0; i < seatingScores.length; i++) {

            if (rowAverage(seatingScores[i]) >= threshold) {
                result += "Row " + i + ": Buzzing Zone";
            } else {
                result += "Row " + i + ": Quiet Zone";
            }

            if (i != seatingScores.length - 1) {
                result += " | ";
            }

        }

        return result;
    }

    public static void main(String[] args) {

        int[][] arr = {
                {40,50,45},
                {85,90,95},
                {30,20,25}
        };

        System.out.println(classifyRows(arr,60));

    }
}