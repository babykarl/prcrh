
package cn.com.prcrh.util.enums;
/**
* @author karl E-mail:1834007615@qq.com
* @version 创建时间：2019年8月14日 下午2:14:28
* 类说明
*/

public enum ErrorMessage {
	/** 未知错误 */
    UNEXPECTED_ERROR("0401", "Unexpected Error"),
    /** 应答结果为空 */
    RESP_RESULT_ISNULL("0402", "Business response data is null"),
    /** 请求参数错误 */
    INVALID_PARAMETER("0403", "Invalid request parameters"),
    /** json转化错误*/
    INVALID_JSON_MSG("0404", "json parse failed"),
	/** json转化错误*/
    UN_SCHOOL_VERIFY("1001", "un school verify");

    
    /** 异常编号 */
    private String code;
    /** 异常描述信息 */
    private String desc;

    ErrorMessage(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

}


