package idv.chy.solid.b_ocp.good;


/*
 * Adding a new shape (e.g., Triangle) doesn't require modifying existing classes, just creating a new subclass of Shape.
 */
public class AreaCalculator {
    public double calculate(Shape shape) {
        return shape.area();
    }
}