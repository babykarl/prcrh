
package cn.com.prcrh.model.db;

import java.util.Date;

/**
* @author karl E-mail:1834007615@qq.com
* 
* @version 创建时间：2019年8月20日 下午4:37:28
* 
* 微信用户信息表
*/

public class WechatUserInfo {
	/**
	 * 主键id
	 */
	private String id;
	/**
	 * 用户id
	 */
	private String userId;
	/**
	 * 微信用户openid
	 */
	private String openId;
	/**
	 * 微信用户unionid
	 */
	private String unionId;
	/**
	 * 微信应用appid
	 */
	private String appId;
	/**
	 * 微信用户昵称
	 */
	private String nickname;
	/**
	 * 手机号
	 */
	private String phoneNo;
	/**
	 * 身份证号
	 */
	private String idCard;
	/**
	 * 性别
	 */
	private String sex;
	/**
	 * 省份
	 */
	private String province;
	/**
	 * 城市
	 */
	private String city;
	/**
	 * 国家
	 */
	private String country;
	/**
	 * 头像
	 */
	private String headimgurl;
	/**
	 * 权限
	 */
	private String privilege;
	/**
	 * 关注
	 */
	private Integer subscribe;
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
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getUnionId() {
		return unionId;
	}
	public void setUnionId(String unionId) {
		this.unionId = unionId;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getHeadimgurl() {
		return headimgurl;
	}
	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}
	public String getPrivilege() {
		return privilege;
	}
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
	public Integer getSubscribe() {
		return subscribe;
	}
	public void setSubscribe(Integer subscribe) {
		this.subscribe = subscribe;
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


