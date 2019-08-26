
package cn.com.prcrh.model.db;

import java.util.Date;

/**
* @author karl E-mail:1834007615@qq.com
* 
* @version 创建时间：2019年8月20日 下午4:29:08
* 
* 用户登录信息表
*/

public class UserLoginInfo {
	/**
	 * 主键id
	 */
	private String id;
	/**
	 * 是否已经绑定手机号
	 * 1：已绑定0：未绑定9：待审核
	 */
	private Integer wxVerify;
	/**
	 * 是否学校认证
	 * 1：已绑定0：未绑定9：待审核
	 */
	private Integer schoolVerify;
	/**
	 * 是否企业认证
	 * 1：已绑定0：未绑定9：待审核
	 */
	private Integer companyVerify;
	/**
	 * 用户状态
	 * 1：可用 2：停用9：黑名单
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
	/**
	 * 获取主键id的方法
	 * @return
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置id的方法
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获得是否已绑定手机号的方法
	 * @return
	 */
	public Integer getWxVerify() {
		return wxVerify;
	}
	/**
	 * 是否设置绑定手机号的方法
	 * @param wxVerify
	 */
	public void setWxVerify(Integer wxVerify) {
		this.wxVerify = wxVerify;
	}
	/**
	 * 获取是否已学校认证的方法
	 * @return
	 */
	public Integer getSchoolVerify() {
		return schoolVerify;
	}
	/**
	 * 设置是否已学校认证的方法
	 * @param schoolVerify
	 */
	public void setSchoolVerify(Integer schoolVerify) {
		this.schoolVerify = schoolVerify;
	}
	/**
	 * 获取是否企业认证的方法
	 * @return
	 */
	public Integer getCompanyVerify() {
		return companyVerify;
	}
	/**
	 * 设置是否企业认证的方法
	 * @param companyVerify
	 */
	public void setCompanyVerify(Integer companyVerify) {
		this.companyVerify = companyVerify;
	}
	/**
	 * 获取状态的方法
	 * @return
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置状态的方法
	 * @param status
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取创建时间的方法
	 * @return
	 */
	public Date getCrtTime() {
		return crtTime;
	}
	/**
	 * 设置创建时间的方法
	 * @param crtTime
	 */
	public void setCrtTime(Date crtTime) {
		this.crtTime = crtTime;
	}
	/**
	 * 获取更新时间的方法
	 * @return
	 */
	public Date getUpdTime() {
		return updTime;
	}
	/**
	 * 设置更新时间的方法
	 * @param updTime
	 */
	public void setUpdTime(Date updTime) {
		this.updTime = updTime;
	}
	
}


