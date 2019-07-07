package pattern.state;

/**
 * if else
 * @author hezhuofan
 */
public class Callback1 {
    public void callback(ApprovalState approvalState){
        if(approvalState.equals(ApprovalState.YES)){
            //some yes callback code
        }
        if(approvalState.equals(ApprovalState.NO)){
            //some no callback code
        }
        if(approvalState.equals(ApprovalState.CANCEL)){
            //some cancel callback code
        }
        throw new CallbackException("unsupported state");
    }
}
