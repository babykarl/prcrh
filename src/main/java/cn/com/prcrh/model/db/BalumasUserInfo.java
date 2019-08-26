
package cn.com.prcrh.model.db;

import java.util.Date;

/**
* @author karl E-mail:1834007615@qq.com
* @version 创建时间：2019年8月20日 下午4:45:23
* 校友信息表
*/

public class BalumasUserInfo {
	/**
	 * 主键id
	 */
	private String id;
	/**
	 * 用户id
	 */
	private String userId;
	/**
	 * 凭据
	 */
	private String evidence;
	/**
	 * 学校id
	 */
	private String schoolId;
	/**
	 * 创建时间
	 */
	private Date crtTime;
	/**
	 * 结束时间
	 */
	private Date updTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEvidence() {
		return evidence;
	}
	public void setEvidence(String evidence) {
		this.evidence = evidence;
	}
	public String getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}
	public Date getCrtTime() {
		return crtTime;
	}
	public void setCrtTime(Date crtTime) {
		this.crtTime = crtTime;
	}
	public Date getUpdTime() {
		return updTime;
	}
	public void setUpdTime(Date updTime) {
		this.updTime = updTime;
	}
	

}


