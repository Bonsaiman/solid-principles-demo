package idv.chy.solid.b_ocp.bad;

/*
 * Adding a new shape (e.g., triangle) would require modifying the AreaCalculator class, violating OCP.
 * Changes to this class could introduce bugs.
 */
public class AreaCalculator {

    public double calculateArea(String shapeType, double... dimensions) {
        if ("circle".equals(shapeType)) {
            return Math.PI * dimensions[0] * dimensions[0];
        } else if ("rectangle".equals(shapeType)) {
            return dimensions[0] * dimensions[1];
        } else {
            throw new IllegalArgumentException("Unsupported shape type");
        }
    }

}