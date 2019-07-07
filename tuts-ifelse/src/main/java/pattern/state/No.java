package pattern.state;

/**
 * @author hezhuofan
 */
public class No implements State {
    public void doAction(Context context) {
        //some no code
        context.setState(this);
    }
}
