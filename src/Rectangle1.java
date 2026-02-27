public class Rectangle1 {
    int length;
    int width;
    Rectangle1() {
        length = 1;
        width = 1;
    }
    Rectangle1(int l, int w) {
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
 class Triangle {
    int base;
    int height;
    Triangle() {
        base = 1;
        height = 1;
    }
    Triangle(int b, int h) {
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
class Test {
    public static void main(String[] args) {
        Triangle t1;
        Rectangle1 r1;
        r1 = new Rectangle1(3,6);
        t1 = new Triangle(2,5);
        t1.display();
        r1.display();
    }
}

