package idv.chy.solid.c_lsp.good;

/*
 * Penguins don't inherit Flyable, avoiding invalid behavior. Instead, they have their own methods, ensuring consistency.
 */
public class Sparrow implements Flyable{
    @Override
    public void fly() {
        System.out.println("Flying...");
    }
}