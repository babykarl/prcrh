
package cn.com.prcrh.model.db;

import java.util.Date;

/**
* @author karl E-mail:1834007615@qq.com
* @version 创建时间：2019年8月14日 下午3:01:21
* 类说明
*/

public class House {
	private String id;
	/*用户id*/
	private String userId;
	/*地铁站台id*/
	private String metroStationId;
	/*价格*/
	private Integer price;
	/*用户类型*/
	private String userType;
	/*电话号码*/
	private String phoneNo;
	/*微信*/
	private String wechat;
	/*qq*/
	private String qq;
	/*面积*/
	private String area;
	/*允许入住时间*/
	private Date chekInTime;
	/*图片链接*/
	private String pictUrl;
	/*状态*/
	private Integer status;
	/*被举报次数*/
	private Integer alterTimes;
	/*描述*/
	private String desc;
	/*房子总共多少层*/
	private Integer height;
	/*出租的房子所在高数*/
	private Integer houseHeight;
	/*几室*/
	private Integer roomNumber;
	/*几厅*/
	private Integer saloonNumber;
	/*所在小区*/
	private String village;
	private Date crtTime;
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
	public String getMetroStationId() {
		return metroStationId;
	}
	public void setMetroStationId(String metroStationId) {
		this.metroStationId = metroStationId;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getWechat() {
		return wechat;
	}
	public void setWechat(String wechat) {
		this.wechat = wechat;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Date getChekInTime() {
		return chekInTime;
	}
	public void setChekInTime(Date chekInTime) {
		this.chekInTime = chekInTime;
	}
	public String getPictUrl() {
		return pictUrl;
	}
	public void setPictUrl(String pictUrl) {
		this.pictUrl = pictUrl;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getAlterTimes() {
		return alterTimes;
	}
	public void setAlterTimes(Integer alterTimes) {
		this.alterTimes = alterTimes;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getHouseHeight() {
		return houseHeight;
	}
	public void setHouseHeight(Integer houseHeight) {
		this.houseHeight = houseHeight;
	}
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Integer getSaloonNumber() {
		return saloonNumber;
	}
	public void setSaloonNumber(Integer saloonNumber) {
		this.saloonNumber = saloonNumber;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
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


