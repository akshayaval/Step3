public class q4 {
    static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int sumA = 0, sumB = 0;

        int max = sectionA[0];
        String section = "A";
        int index = 0;

        for (int i = 0; i < sectionA.length; i++) {
            sumA += sectionA[i];

            if (sectionA[i] > max) {
                max = sectionA[i];
                section = "A";
                index = i;
            }
        }

        for (int i = 0; i < sectionB.length; i++) {
            sumB += sectionB[i];

            if (sectionB[i] > max) {
                max = sectionB[i];
                section = "B";
                index = i;
            }
        }

        System.out.println("Section A Total: " + sumA);
        System.out.println("Section B Total: " + sumB);

        if (sumA == sumB)
            System.out.println("Status: Balanced");
        else
            System.out.println("Status: Not Balanced");

        System.out.println("Highest Quantity: " + max +
                " (Section " + section + ", Item " + (index + 1) + ")");
    }

    public static void main(String[] args) {
        int[] A = {20, 15, 30};
        int[] B = {25, 10, 30};

        analyzeInventory(A, B);
    }
}