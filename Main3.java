import java.util.*;

abstract class Item {
    String title;
    int daysLate;

    Item(String title, int daysLate) {
        this.title = title;
        this.daysLate = daysLate;
    }

    abstract double fine();
}

class Book extends Item {
    Book(String title, int daysLate) {
        super(title, daysLate);
    }

    double fine() {
        return daysLate * 2;
    }
}

class DVD extends Item {
    DVD(String title, int daysLate) {
        super(title, daysLate);
    }

    double fine() {
        return Math.min(daysLate * 5, 50);
    }
}

class Magazine extends Item {
    Magazine(String title, int daysLate) {
        super(title, daysLate);
    }

    double fine() {
        return daysLate;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String title = sc.next();
            int days = sc.nextInt();

            Item item;

            if (type.equals("BOOK")) {
                item = new Book(title, days);
            } else if (type.equals("DVD")) {
                item = new DVD(title, days);
            } else {
                item = new Magazine(title, days);
            }

            System.out.printf("%s: %.2f%n", title, item.fine());
            total += item.fine();
        }

        System.out.printf("Total Fines: %.2f%n", total);
    }
}