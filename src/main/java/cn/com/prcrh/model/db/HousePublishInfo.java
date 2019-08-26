
package cn.com.prcrh.model.db;

import java.util.Date;

/**
* @author karl E-mail:1834007615@qq.com
* 
* @version 创建时间：2019年8月20日 下午8:18:06
* 
* 房源发布信息表
*/

public class HousePublishInfo {
	/**
	 * 主键id
	 */
	private String id;
	/**
	 * 用户id
	 */
	private String userId;
	/**
	 * 基本信息id
	 */
	private String basicInfoId;
	/**
	 * 发布人角色
	 */
	private Integer publishRole;
	/**
	 * 价格
	 */
	private String price;
	/**
	 * 地址
	 */
	private String address;
	/**
	 * 被举报次数
	 */
	private Integer alterTimes;
	/**
	 * 地铁位置
	 */
	private String metroId;
	/**
	 * 地区位置
	 */
	private String cityDistirctId;
	/**
	 * 状态
	 */
	private Integer status;
	/**
	 * 是否仅对校友可见
	 */
	private Integer onlyBalumas;
	/**
	 * 是否仅对企业员工可见
	 */
	private Integer onlyCompany;
	/**
	 * 是否整租
	 */
	private Integer fullRent;
	/**
	 * 是否合租
	 */
	private Integer contenancy;
	/**
	 * 合租类型
	 */
	private Integer rentType;
	/**
	 * 联系方式
	 */
	private String coonnection;
	/**
	 * 描述
	 */
	private String note;
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
	public String getBasicInfoId() {
		return basicInfoId;
	}
	public void setBasicInfoId(String basicInfoId) {
		this.basicInfoId = basicInfoId;
	}
	public Integer getPublishRole() {
		return publishRole;
	}
	public void setPublishRole(Integer publishRole) {
		this.publishRole = publishRole;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getAlterTimes() {
		return alterTimes;
	}
	public void setAlterTimes(Integer alterTimes) {
		this.alterTimes = alterTimes;
	}
	public String getMetroId() {
		return metroId;
	}
	public void setMetroId(String metroId) {
		this.metroId = metroId;
	}
	public String getCityDistirctId() {
		return cityDistirctId;
	}
	public void setCityDistirctId(String cityDistirctId) {
		this.cityDistirctId = cityDistirctId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getOnlyBalumas() {
		return onlyBalumas;
	}
	public void setOnlyBalumas(Integer onlyBalumas) {
		this.onlyBalumas = onlyBalumas;
	}
	public Integer getOnlyCompany() {
		return onlyCompany;
	}
	public void setOnlyCompany(Integer onlyCompany) {
		this.onlyCompany = onlyCompany;
	}
	public Integer getFullRent() {
		return fullRent;
	}
	public void setFullRent(Integer fullRent) {
		this.fullRent = fullRent;
	}
	public Integer getContenancy() {
		return contenancy;
	}
	public void setContenancy(Integer contenancy) {
		this.contenancy = contenancy;
	}
	public Integer getRentType() {
		return rentType;
	}
	public void setRentType(Integer rentType) {
		this.rentType = rentType;
	}
	public String getCoonnection() {
		return coonnection;
	}
	public void setCoonnection(String coonnection) {
		this.coonnection = coonnection;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
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


