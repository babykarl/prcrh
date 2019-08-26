
package cn.com.prcrh.dao;

import cn.com.prcrh.model.user.BalumasRequest;
import cn.com.prcrh.model.user.BalumasSelect;

/**
* @author karl E-mail:1834007615@qq.com
* 
* @version 创建时间：2019年8月21日 下午8:09:25
* 
* 校友相关操作服务
*/

public interface BalumasDao {

	/**
	 * 校友查找房源
	 * 
	 * @param request
	 * 
	 * @return
	 * 
	 */
	public BalumasSelect findBalumasInfo(BalumasRequest request);

}


