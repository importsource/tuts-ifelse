/**
 * @author hezhuofan
 */
public class Demo {
    /**
     * bad case
     * @param someParam
     */
    private void forYes(String someParam) {
        if (null != someParam) {
            // some not null code ....

            boolean isExist = exist();
            if (isExist) {
                // some exist code
                System.out.println();
            } else {
               // some not exist code
            }
        } else {
            // some null code
        }
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
        boolean isExist = exist();
        if (!isExist) {
            // some not exist code
            return;
        }
        System.out.println();
        // exist case code
        //主逻辑代码
    }

    private int ideal(String param){
        if(null==param)return 1;
        if(!exist())return 2;
        if(!param.contains("."))return 3;
        //main biz code.
        System.out.println("main biz code");
        return 0;
    }

    private boolean exist() {
        return false;
    }
}
