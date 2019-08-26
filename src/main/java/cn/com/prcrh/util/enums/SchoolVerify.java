
package cn.com.prcrh.util.enums;
/**
* @author karl E-mail:1834007615@qq.com
* @version 创建时间：2019年8月20日 下午9:19:40
* 类说明
*/

public enum SchoolVerify {
    /** 可用 */
    USED(1),
    /** 不可用 */
    UNUSED(0),
	/** 不可用 */
    WAIT(9);
    
    private Integer status;

    public Integer getStatus() {
        return status;
    }

    private SchoolVerify(Integer status) {
        this.status = status;
    }

}


