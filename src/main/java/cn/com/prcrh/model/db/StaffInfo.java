
package cn.com.prcrh.model.db;

import java.util.Date;

/**
* @author karl E-mail:1834007615@qq.com
* 
* @version 创建时间：2019年8月20日 下午4:52:07
* 
* 企业员工信息表
*/

public class StaffInfo {
	/**
	 * 主键id
	 */
	private String id;
	/**
	 * 用户id
	 */
	private String user_id;
	/**
	 * 企业id
	 */
	private String company_id;
	/**
	 * 凭据
	 */
	private String evidence;
	/**
	 * 创建时间
	 */
	private Date crtTime;
	/**
	 * 更新时间
	 */
	private Date updTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getCompany_id() {
		return company_id;
	}
	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}
	public String getEvidence() {
		return evidence;
	}
	public void setEvidence(String evidence) {
		this.evidence = evidence;
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


