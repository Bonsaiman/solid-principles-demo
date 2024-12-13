package idv.chy.solid.c_lsp.good;

/*
 * LSP - Liskov Substitution Principle
 *
 * Objects of a superclass should be replaceable with objects of a subclass without affecting the functionality
 * of the program. In other words, a subclass should extend the behavior of a superclass without changing its original intent.
 */
public interface Flyable {
    void fly();
}
