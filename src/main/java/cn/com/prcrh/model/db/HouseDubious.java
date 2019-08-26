
package cn.com.prcrh.model.db;

import java.util.Date;

/**
* @author karl E-mail:1834007615@qq.com
* 
* @version 创建时间：2019年8月20日 下午8:28:17
* 
* 虚假房源表
*/

public class HouseDubious {
	/**
	 * 主键id
	 */
	private String id;
	/**
	 * 用户id
	 */
	private String userId;
	/**
	 * 房源发布id
	 */
	private String housePublishId;
	/**
	 * 状态
	 */
	private Integer status;
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
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getHousePublishId() {
		return housePublishId;
	}
	public void setHousePublishId(String housePublishId) {
		this.housePublishId = housePublishId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
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


