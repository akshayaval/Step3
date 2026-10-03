import java.util.*;

abstract class Booking {
    static final double FEE = 50;

    int distance;

    Booking(int distance) {
        this.distance = distance;
    }

    abstract double fare();

    double total() {
        return fare() + FEE;
    }
}

class Bus extends Booking {
    Bus(int distance) {
        super(distance);
    }

    double fare() {
        return distance * 2;
    }
}

class Train extends Booking {
    Train(int distance) {
        super(distance);
    }

    double fare() {
        return distance * 1.5;
    }
}

class Flight extends Booking {
    Flight(int distance) {
        super(distance);
    }

    double fare() {
        return 2500 + distance * 4;
    }
}

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String mode = sc.next();
            int distance = sc.nextInt();

            Booking b;

            if (mode.equals("BUS")) {
                b = new Bus(distance);
            } else if (mode.equals("TRAIN")) {
                b = new Train(distance);
            } else {
                b = new Flight(distance);
            }

            System.out.printf("%s: %.2f%n", mode, b.total());
        }
    }
}