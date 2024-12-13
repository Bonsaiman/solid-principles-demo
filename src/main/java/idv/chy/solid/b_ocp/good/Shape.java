package idv.chy.solid.b_ocp.good;

/*
 * OCP - Open Closed Principle
 *
 * Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.
 * This means you can add new functionality without changing existing code.
 */
public sealed interface Shape permits Rectangle, Circle {
    double area();
}
