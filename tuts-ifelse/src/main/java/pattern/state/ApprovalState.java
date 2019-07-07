package pattern.state;

/**
 * @author hezhuofan
 */
public enum ApprovalState {
    YES("yes",1),
    NO("no",2),
    CANCEL("cancel",3);

    private String name;
    private int code;
    ApprovalState(String name,int code){
        this.name=name;
        this.code=code;
    }
}
