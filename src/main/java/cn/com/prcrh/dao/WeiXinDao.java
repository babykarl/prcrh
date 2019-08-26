
package cn.com.prcrh.dao;

import cn.com.prcrh.model.db.UserInfo;

/**
* @author karl E-mail:1834007615@qq.com
* @version 创建时间：2019年8月13日 下午6:44:45
* 类说明
*/

public interface WeiXinDao {
	
	/**
	 * @param openId
	 * @return
	 */
	String selectUserInfoByOpenId(String openId);

	/**
	 * 创建用户
	 * @param userInfo
	 * @return 
	 */
	void insertUserInfo(UserInfo userInfo);

}


