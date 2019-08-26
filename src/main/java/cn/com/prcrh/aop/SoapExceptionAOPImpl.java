
package cn.com.prcrh.aop;
/**
* @author karl E-mail:1834007615@qq.com
* @version 创建时间：2019年8月13日 下午7:12:01
* 类说明
*/

public class SoapExceptionAOPImpl implements SoapExceptionAOP {


	@Override
	public Object soapExceptionAOP() throws Throwable {
		throw new BusinessException("soap.connection.error");
	}

}


