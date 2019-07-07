/**
 * @author hezhuofan
 */
public class Demo1 {

    private UserService userService;
    public Demo1(UserService userService){
        this.userService=userService;
    }
    /**
     * good case
     * @param someParam
     */
    private void forYes1(String someParam) {
        if(null==someParam){
            // some null case code
            return;
        }
        // some not nvl case code ....
        if (!userService.exist()) {
            // some not exist code
            return;
        }
        // exist case code
        //主逻辑代码
        mainBiz(someParam);
    }

    private void mainBiz(String someParam) {
        //main biz code
        System.out.println();
    }

    private boolean exist() {
        // some exist code
        return false;
    }
}
