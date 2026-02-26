package practical;

public abstract class Shape {
    protected int a, b;

    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // abstract method
    public abstract void printArea();
}