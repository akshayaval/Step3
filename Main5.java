import java.time.LocalDate;
import java.util.*;

class Plan {
    String name;
    LocalDate startDate;

    Plan(String name, LocalDate startDate) {
        this.name = name;
        this.startDate = startDate;
    }

    int getDays() {
        return 0;
    }

    LocalDate getRenewalDate() {
        return startDate.plusDays(getDays());
    }
}

class Basic extends Plan {
    Basic(String name, LocalDate startDate) {
        super(name, startDate);
    }

    int getDays() {
        return 30;
    }
}

class Standard extends Plan {
    Standard(String name, LocalDate startDate) {
        super(name, startDate);
    }

    int getDays() {
        return 90;
    }
}

class Premium extends Plan {
    Premium(String name, LocalDate startDate) {
        super(name, startDate);
    }

    int getDays() {
        return 365;
    }
}

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            LocalDate startDate = LocalDate.parse(sc.next());

            Plan plan;

            if (type.equals("BASIC"))
                plan = new Basic(name, startDate);
            else if (type.equals("STANDARD"))
                plan = new Standard(name, startDate);
            else
                plan = new Premium(name, startDate);

            System.out.println(name + ": " + plan.getRenewalDate());
        }
    }
}