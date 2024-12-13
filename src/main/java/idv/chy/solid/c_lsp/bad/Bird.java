package idv.chy.solid.c_lsp.bad;


/*
 * Penguin cannot replace Bird without altering the behavior. Clients relying on Bird's fly() method would break.
 */
public class Bird {
    public void fly() {
        System.out.println("Flying...");
    }
}

