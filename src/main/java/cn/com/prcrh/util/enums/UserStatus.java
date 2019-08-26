
package cn.com.prcrh.util.enums;
/**
* @author karl E-mail:1834007615@qq.com
* @version 创建时间：2019年8月14日 上午10:25:43
* 类说明
*/

public enum UserStatus {
    /** 可用 */
    USED(1),
    /** 不可用 */
    UNUSED(9);
    
    private Integer status;

    public Integer getStatus() {
        return status;
    }

    private UserStatus(Integer status) {
        this.status = status;
    }
}


