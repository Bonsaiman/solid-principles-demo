package idv.chy.solid.b_ocp.good;

public final class Rectangle implements Shape {
    private double width;
    private double height;

    @Override
    public double area() {
        return this.width * this.height;
    }
}