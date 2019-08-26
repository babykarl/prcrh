
package cn.com.prcrh.model.db;

import java.util.Date;

/**
* @author karl E-mail:1834007615@qq.com
* 
* @version 创建时间：2019年8月20日 下午4:57:47
* 
* 房源基本信息表
*/

public class BasicHouseInfo {
	/**
	 * 主键id
	 */
	private String id;
	/**
	 * 房源图片
	 */
	private String pictUrl;
	/**
	 * 面积
	 */
	private String area;
	/**
	 * 楼高
	 */
	private Integer floor;
	/**
	 * 所在楼层
	 */
	private Integer currentFloor;
	/**
	 * 卧室数量
	 */
	private Integer roomNumber;
	/**
	 * 客厅数量
	 */
	private Integer saloonNumber;
	/**
	 * 卫生间数量
	 */
	private Integer bathroomNumbrer;
	/**
	 * 是否可以做饭
	 */
	private Integer cookie;
	/**
	 * 是否可办居住证
	 */
	private Integer residencePermit;
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
	public String getPictUrl() {
		return pictUrl;
	}
	public void setPictUrl(String pictUrl) {
		this.pictUrl = pictUrl;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Integer getFloor() {
		return floor;
	}
	public void setFloor(Integer floor) {
		this.floor = floor;
	}
	public Integer getCurrentFloor() {
		return currentFloor;
	}
	public void setCurrentFloor(Integer currentFloor) {
		this.currentFloor = currentFloor;
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
	public Integer getBathroomNumbrer() {
		return bathroomNumbrer;
	}
	public void setBathroomNumbrer(Integer bathroomNumbrer) {
		this.bathroomNumbrer = bathroomNumbrer;
	}
	public Integer getCookie() {
		return cookie;
	}
	public void setCookie(Integer cookie) {
		this.cookie = cookie;
	}
	public Integer getResidencePermit() {
		return residencePermit;
	}
	public void setResidencePermit(Integer residencePermit) {
		this.residencePermit = residencePermit;
	}
	public Date getUpdTime() {
		return updTime;
	}
	public void setUpdTime(Date updTime) {
		this.updTime = updTime;
	}
	
}


