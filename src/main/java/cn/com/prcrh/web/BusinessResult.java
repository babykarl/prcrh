
package cn.com.prcrh.web;
/**
* @author karl E-mail:1834007615@qq.com
* @version 创建时间：2019年8月14日 下午2:02:41
* 类说明
*/

public class BusinessResult {
	private static final long serialVersionUID = 5089850559112918464L;
	private String result;
	private String message;

	public BusinessResult(String result, String message) {
		super();
		this.result = result;
		this.message = message;
	}

	public BusinessResult() {
		super();
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


}


