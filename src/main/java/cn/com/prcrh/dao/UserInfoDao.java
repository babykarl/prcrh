
package cn.com.prcrh.dao;
/**
* @author karl E-mail:1834007615@qq.com
* @version 创建时间：2019年8月20日 下午9:13:21
* 类说明
*/

public interface UserInfoDao {

	/**
	 * 根据用户id寻找是否已验证
	 * 
	 * @param userId
	 * 
	 * @return
	 */
	Integer selectSchoolVerifyByUserId(String userId);

}


