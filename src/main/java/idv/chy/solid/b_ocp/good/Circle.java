package idv.chy.solid.b_ocp.good;

public final class Circle implements Shape {
    private double radius;

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}