public class q3 {
    static void findLongestStreak(String signalLog) {
        char maxChar = signalLog.charAt(0);
        int maxCount = 1;
        int count = 1;

        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == signalLog.charAt(i - 1)) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    maxChar = signalLog.charAt(i - 1);
                }
                count = 1;
            }
        }

        if (count > maxCount) {
            maxCount = count;
            maxChar = signalLog.charAt(signalLog.length() - 1);
        }

        System.out.println("Longest Streak: '" + maxChar + "' repeated " + maxCount + " times");
    }

    public static void main(String[] args) {
        findLongestStreak("RRGGGYRR");
    }
}