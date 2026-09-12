class Course {
    String code;
    String title;
    int credits;
    int labCredits;

    public Course(String code, String title, int credits, int labCredits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.labCredits = labCredits;
    }

    public Course(String code, String title, int credits) {
        this(code, title, credits, 0);
    }

    public int totalCredits() {
        return credits + labCredits;
    }

    public static void main(String[] args) {
        Course c1 = new Course("CS101", "Java Programming", 4, 2);
        Course c2 = new Course("MA101", "Mathematics", 4);

        System.out.println("Total credits of c1: " + c1.totalCredits());
        System.out.println("Total credits of c2: " + c2.totalCredits());
    }
}