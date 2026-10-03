import java.util.*;

abstract class Plot {
    String owner;

    Plot(String owner) {
        this.owner = owner;
    }

    abstract double area();

    abstract String shape();
}

class Circle extends Plot {
    double radius;

    Circle(String owner, double radius) {
        super(owner);
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    String shape() {
        return "CIRCLE";
    }
}

class Rectangle extends Plot {
    double length, width;

    Rectangle(String owner, double length, double width) {
        super(owner);
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    String shape() {
        return "RECTANGLE";
    }
}

class Triangle extends Plot {
    double base, height;

    Triangle(String owner, double base, double height) {
        super(owner);
        this.base = base;
        this.height = height;
    }

    double area() {
        return 0.5 * base * height;
    }

    String shape() {
        return "TRIANGLE";
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String owner = sc.next();

            Plot p;

            if (type.equals("CIRCLE")) {
                double r = sc.nextDouble();
                p = new Circle(owner, r);
            } else if (type.equals("RECTANGLE")) {
                double l = sc.nextDouble();
                double w = sc.nextDouble();
                p = new Rectangle(owner, l, w);
            } else {
                double b = sc.nextDouble();
                double h = sc.nextDouble();
                p = new Triangle(owner, b, h);
            }

            System.out.printf("%s (%s): %.2f%n", owner, p.shape(), p.area());
            total += p.area();
        }

        System.out.printf("Total Area: %.2f%n", total);
    }
}