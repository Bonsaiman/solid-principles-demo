package idv.chy.solid.d_isp.bad;

/*
 * RobotWorker is forced to implement eat() even though it doesn't need it, violating ISP
 */
public class RobotWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Robot working...");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robots don't eat");
    }
}