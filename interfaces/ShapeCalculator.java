package interfaces;

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape C = new Circle(5);
        System.out.println("Circle");
        System.out.println("Area" + C.calculatearea());
        System.out.println("perimeter" + C.calculateperimeter());

        Shape S = new Square(15);
        System.out.println("Square");
        System.out.println("Area" + S.calculatearea());
        System.out.println("perimeter" + S.calculateperimeter());

        Shape R = new Rectangle(10, 5);
        System.out.println("Rectangle");
        System.out.println("Area" + R.calculatearea());
        System.out.println("perimeter" + R.calculateperimeter());

    }

}

interface Shape {
    double calculatearea();

    double calculateperimeter();
}

class Circle implements Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    public double calculatearea() {
        return (r * r);
    }

    public double calculateperimeter() {
        return (2 * Math.PI * r);
    }
}

class Square implements Shape {
    double size;

    Square(double size) {
        this.size = size;
    }

    public double calculatearea() {
        return (size * size);
    }

    public double calculateperimeter() {
        return (4 * size);
    }
}

class Rectangle implements Shape {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;

    }

    public double calculatearea() {
        return (length * breadth);
    }

    public double calculateperimeter() {
        return (2 * (length + breadth));
    }
}
