package pattern.state;

/**
 * @author hezhuofan
 */
public class Yes implements State {
    public void doAction(Context context) {
        //some yes code
        context.setState(this);
    }
}
