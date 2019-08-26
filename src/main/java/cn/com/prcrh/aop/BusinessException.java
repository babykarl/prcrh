
package cn.com.prcrh.aop;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import cn.com.prcrh.web.BusinessResult;

/**
* @author karl E-mail:1834007615@qq.com
* @version 创建时间：2019年8月13日 下午7:03:38
* 类说明
*/

public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = 3309062052884596409L;

	private final String code;

	public BusinessException(String code, String message, Throwable throwable) {
		super(message, throwable);
		this.code = code;
	}

	public BusinessException(String code, Throwable throwable) {
		this(code, null, throwable);
	}

	public BusinessException(String code) {
		this(code, null, null);
	}

	public BusinessException(String code, String message) {
		this(code, message, null);
	}

	public String getCode() {
		return code;
	}
	
	public String toJson() {
		BusinessResult em = new BusinessResult();
		if (this.getCode() != null) {
			em.setResult(this.getCode());
		}

		if (this.getMessage() != null) {
			em.setMessage(this.getMessage());
		}

		ObjectMapper om = new ObjectMapper();
		om.setSerializationInclusion(Include.NON_NULL);
		try {
			return om.writeValueAsString(em);

		} catch (JsonProcessingException e) {
			return null;
		}
	}

}


