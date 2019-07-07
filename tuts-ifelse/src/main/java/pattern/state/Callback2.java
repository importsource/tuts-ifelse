package pattern.state;


/**
 * @author hezhuofan
 */
public class Callback2 {
    public void callback(ApprovalState approvalState){
        State state=StateFactory.get(approvalState);
        Context context=new Context();
        state.doAction(context);
        throw new CallbackException("unsupported state");
    }
}
