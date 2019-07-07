package pattern.state;

/**
 * @author hezhuofan
 */
public class Cancel implements State {
    public void doAction(Context context) {
        // some cancel code
        context.setState(this);
    }
}
