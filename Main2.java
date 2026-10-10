
import java.util.Scanner;

abstract class Parcel {
    double weight, value;

    Parcel(double weight, double value) {
        this.weight = weight;
        this.value = value;
    }

    abstract double charge();
}

interface Insurable {
    double insurance();
}

class Standard extends Parcel {
    Standard(double w, double v) {
        super(w, v);
    }

    double charge() {
        return 40 + 10 * weight;
    }
}

class Express extends Parcel implements Insurable {
    Express(double w, double v) {
        super(w, v);
    }

    double charge() {
        return 80 + 15 * weight;
    }

    public double insurance() {
        return value * 0.02;
    }
}

class Fragile extends Parcel implements Insurable {
    Fragile(double w, double v) {
        super(w, v);
    }

    double charge() {
        return 40 + 10 * weight + 50;
    }

    public double insurance() {
        return value * 0.02;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double grand = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double w = sc.nextDouble();
            double v = sc.nextDouble();
            Parcel p;
            double ins = 0;

            switch (type) {
                case "STANDARD":
                    p = new Standard(w, v);
                    break;
                case "EXPRESS":
                    p = new Express(w, v);
                    break;
                default:
                    p = new Fragile(w, v);
            }

            if (p instanceof Insurable) {
                ins = ((Insurable) p).insurance();
            }

            double charge = p.charge();
            double total = charge + ins;
            grand += total;

            System.out.printf(
                "%s: Charge=%.2f Insurance=%.2f Total=%.2f%n",
                type, charge, ins, total
            );
        }

        System.out.printf("Grand Total: %.2f%n", grand);
        sc.close();
    }
}
