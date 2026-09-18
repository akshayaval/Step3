class CompanyInfo {

    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    CompanyInfo(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {

        CompanyInfo e1 = new CompanyInfo("Amit", 50000);
        CompanyInfo e2 = new CompanyInfo("Riya", 60000);
        CompanyInfo e3 = new CompanyInfo("Rahul", 55000);

        CompanyInfo.printCompanyInfo();
    }
}
