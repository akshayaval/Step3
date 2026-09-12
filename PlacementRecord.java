class PlacementRecord {
    String studentName;
    String company;
    double packageLpa;

    PlacementRecord(String studentName, String company, double packageLpa) {
        this.studentName = studentName;
        this.company = company;
        this.packageLpa = packageLpa;
    }

    void printRecord() {
        System.out.println(studentName + " | " + company + " | " + packageLpa + " LPA");
    }

    public static void main(String[] args) {
        PlacementRecord p1 = new PlacementRecord("Akshaya", "TCS", 6.5);
        PlacementRecord p2 = new PlacementRecord("Rahul", "Infosys", 7.2);
        PlacementRecord p3 = new PlacementRecord("Priya", "Wipro", 5.8);

        PlacementRecord[] records = {p1, p2, p3};

        for (int i = 0; i < records.length; i++) {
            records[i].printRecord();
        }
    }
}