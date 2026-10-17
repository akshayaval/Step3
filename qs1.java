class qs1 {
    static void attendanceSummary(int[] days) {
        int present = 0, streak = 0, longest = 0;

        for (int i = 0; i < days.length; i++) {
            if (days[i] == 1) {
                present++;
                streak++;

                if (streak > longest) {
                    longest = streak;
                }
            } else {
                streak = 0;
            }
        }

        System.out.println("Present: " + present +
                           ", Longest streak: " + longest);
    }

    public static void main(String[] args) {
        int[] days = {1, 1, 0, 1, 1, 1, 0, 1};
        attendanceSummary(days);
    }
}