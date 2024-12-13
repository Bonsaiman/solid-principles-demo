package idv.chy.solid.d_isp.good;

/*
 * ISP - Interface Segregation Principle
 *
 * No client should be forced to depend on methods it does not use.
 * This means that interfaces should be specific to the clients that use them.
 */
public interface Workable {
    void work();
}
