import java.util.Arrays;

class Candidate implements Comparable<Candidate> {

    String name;
    double cgpa;
    int codingScore;

    Candidate(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
    }

    static boolean isEligible(double cgpa) {
        return cgpa >= 7.0;
    }

    static boolean isEligible(double cgpa, int codingScore) {
        return cgpa >= 6.5 && codingScore >= 60;
    }

    double totalScore() {
        return cgpa * 10 + codingScore;
    }

    public int compareTo(Candidate other) {
        return Double.compare(other.totalScore(), this.totalScore());
    }
}

public class qs5 {

    static String shortlistAndRank(Candidate[] candidates) {

        Candidate[] temp = new Candidate[candidates.length];
        int count = 0;

        for (Candidate c : candidates) {

            if (Candidate.isEligible(c.cgpa) ||
                Candidate.isEligible(c.cgpa, c.codingScore)) {

                temp[count++] = c;
            }

        }

        Candidate[] list = Arrays.copyOf(temp, count);

        Arrays.sort(list);

        String result = "";

        for (int i = 0; i < list.length; i++) {

            result += (i + 1) + ". " + list[i].name +
                    " (" + list[i].totalScore() + ")";

            if (i != list.length - 1) {
                result += " | ";
            }

        }

        return result;
    }

    public static void main(String[] args) {

        Candidate[] c = {
                new Candidate("Aisha",8.2,40),
                new Candidate("Rohit",6.8,65),
                new Candidate("Meena",6.0,90),
                new Candidate("Karan",7.5,20)
        };

        System.out.println(shortlistAndRank(c));

    }
}