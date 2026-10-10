
import java.util.Scanner;

abstract class Cab {
    static final double MIN_FARE = 100;
    double km;

    Cab(double km) {
        this.km = km;
    }

    abstract double rate();

    double fare() {
        return Math.max(MIN_FARE, km * rate());
    }
}

interface NightService {
    double nightFare();
}

class Mini extends Cab {
    Mini(double km) {
        super(km);
    }

    double rate() {
        return 10;
    }
}

class Sedan extends Cab implements NightService {
    Sedan(double km) {
        super(km);
    }

    double rate() {
        return 14;
    }

    public double nightFare() {
        return fare() * 1.20;
    }
}

class SUV extends Cab implements NightService {
    SUV(double km) {
        super(km);
    }

    double rate() {
        return 18;
    }

    public double nightFare() {
        return fare() * 1.20;
    }
}

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double km = sc.nextDouble();
            String time = sc.next();
            Cab c;

            switch (type) {
                case "MINI":
                    c = new Mini(km);
                    break;
                case "SEDAN":
                    c = new Sedan(km);
                    break;
                default:
                    c = new SUV(km);
            }

            if (time.equals("NIGHT") && !(c instanceof NightService)) {
                System.out.println("MINI: night service not available");
                continue;
            }

            double fare = c.fare();

            if (time.equals("NIGHT")) {
                fare = ((NightService) c).nightFare();
            }

            System.out.printf("%s: %.2f%n", type, fare);
            total += fare;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
