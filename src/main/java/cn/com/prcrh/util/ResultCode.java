
package cn.com.prcrh.util;

import org.apache.commons.lang.StringUtils;

/**
* @author karl E-mail:1834007615@qq.com
* @version 创建时间：2019年8月14日 上午9:30:58
* 类说明
*/

public enum ResultCode {

	SUCCESS(200, "successful"),//成功请求
	FAILURE(1,"操作失败"),
	SYSTEM_ERROR(2, "系统错误"),
	TEST_EXCEPTION(3,"异常测试示例结果"),
	;
 
	private int code;
	private String message;
 
	private ResultCode(int code, String msg) {
		this.code = code;
		this.message = msg;
	}
 
	public int getCode() {
		return code;
	}
 
	public String getMessage() {
		return message;
	}
 
	public boolean isSuccess() {
		return this.code == 200;
	}
 
	public static ResultCode valueOf(int code) {
		for (ResultCode value : values()) {
			if (code == value.code) {
				return value;
			}
		}
		return SUCCESS;
	}
 
 
	public static boolean contains(String name) {
		if (StringUtils.isBlank(name)) {
			return false;
		} else {
			ResultCode[] var1 = values();
			int var2 = var1.length;
 
			for(int var3 = 0; var3 < var2; ++var3) {
				ResultCode value = var1[var3];
				if (value.name().equals(name)) {
					return true;
				}
			}
 
			return false;
		}
	}
}


