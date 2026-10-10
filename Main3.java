
import java.util.Scanner;

abstract class Student {
    static final double BUS_FEE = 12000;
    String name;

    Student(String name) {
        this.name = name;
    }

    abstract double fee();
}

class DayScholar extends Student {
    DayScholar(String name) {
        super(name);
    }

    double fee() {
        return 40000 + BUS_FEE;
    }
}

class Hosteller extends Student {
    Hosteller(String name) {
        super(name);
    }

    double fee() {
        return 40000 + 60000;
    }
}

class Scholar extends Student {
    Scholar(String name) {
        super(name);
    }

    double fee() {
        return 20000 + BUS_FEE;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            Student s;

            switch (type) {
                case "DAY_SCHOLAR":
                    s = new DayScholar(name);
                    break;
                case "HOSTELLER":
                    s = new Hosteller(name);
                    break;
                default:
                    s = new Scholar(name);
            }

            double fee = s.fee();
            System.out.printf("%s: %.2f%n", name, fee);
            total += fee;
        }

        System.out.printf("Total Collected: %.2f%n", total);
        sc.close();
    }
}
