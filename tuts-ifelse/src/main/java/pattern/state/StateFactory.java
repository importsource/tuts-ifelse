package pattern.state;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author hezhuofan
 */
public class StateFactory {
    private static Map<ApprovalState,State> stateInstances=new ConcurrentHashMap<ApprovalState, State>();

    static {
        put(ApprovalState.YES,new Yes());
        put(ApprovalState.NO,new No());
        put(ApprovalState.CANCEL,new Cancel());
    }

    public static void put(ApprovalState key,State state){
        stateInstances.put(key,state);
    }
    public static State get(ApprovalState key){
        return stateInstances.get(key);
    }
}
