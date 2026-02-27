public class Rectangle2 {
    int length;
    int width;
    Rectangle2() {
        length = 1;
        width = 1;
    }
    Rectangle2(int l, int w) {
        length = l;
        width = w;
    }
    int area() {
        return length * width;
    }
    int perimeter() {
        return (length*2) + (width*2);
    }
    void display() {
        System.out.println("Rectangle " + length + " x " + width);
        System.out.println("Area =  " + area());
        System.out.println("Perimeter =  " + perimeter());
    }
}
 class Triangle2 {
    int base;
    int height;
    Triangle2() {
        base = 1;
        height = 1;
    }
    Triangle2(int b, int h) {
        base = b;
        height = h;
    }
    double area() {
        return 1.0 / 2 * base * height;
    }
    void display() {
        System.out.println("Triangle: ");
        System.out.println("Base: " + base + " Height: " + height);
        System.out.println("Area =  " + area());
    }
}
class Test2 {
    public static void main(String[] args) {
        Triangle t1;
        Rectangle2 r1;
        Circle c1,c2;
        r1 = new Rectangle2(3,6);
        t1 = new Triangle(2,5);
        c1 = new Circle(7);
        c2 = new Circle();
        t1.display();
        r1.display();
        c1.display();
        c2.display();
    }
}
class Circle {
    int radius;

    Circle() {
        radius = 1;
    }

    Circle(int r) {
        radius = r;
    }

    double area() {
        return 3.1416 * radius * radius;
    }

    double circumference() {
        return 2 * 3.1416 * radius;
    }

    void display() {
        System.out.println("Circle:");
        System.out.println("Radius: " + radius);
        System.out.printf("Area = %.2f\n", area());
        System.out.printf("Circumference = %.2f\n", circumference());
    }
}
