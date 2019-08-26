
package cn.com.prcrh.model.user;

import javax.validation.constraints.NotNull;

/**
* @author karl E-mail:1834007615@qq.com
* 
* @version 创建时间：2019年8月20日 下午8:55:02
* 
* 校友查找房源数据请求参数
*/

public class BalumasRequest {
	/**
	 * 用户id
	 */
	@NotNull(message="用户id不能为空")
	private String userId;
	/**
	 * 城市id
	 */
	@NotNull(message="城市不能为空")
	private String cityId;
	/**
	 * 地铁id
	 */
	private String metroId;
	/**
	 * 最小价格
	 */
	private Integer mixPrice;
	/**
	 * 最大价格
	 */
	private Integer maxPrice;
	/**
	 * 地区id
	 */
	private String dictrictId;
	/**
	 * 是否只查看本校
	 */
	private Integer onlySelectSelfSchool;
	/**
	 * 整租
	 */
	private Integer fullRent;
	/**
	 * 合租
	 */
	private Integer contenancy;
	/**
	 * 几室
	 */
	private Integer roomNumber;
	/**
	 * 几厅
	 */
	private Integer saloonNumber;
	/**
	 * 是否可以做饭
	 */
	private Integer cookie;
	/**
	 * 是否可以办居住证
	 */
	private Integer resiDencePermit;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public String getMetroId() {
		return metroId;
	}
	public void setMetroId(String metroId) {
		this.metroId = metroId;
	}
	public Integer getMixPrice() {
		return mixPrice;
	}
	public void setMixPrice(Integer mixPrice) {
		this.mixPrice = mixPrice;
	}
	public Integer getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(Integer maxPrice) {
		this.maxPrice = maxPrice;
	}
	public String getDictrictId() {
		return dictrictId;
	}
	public void setDictrictId(String dictrictId) {
		this.dictrictId = dictrictId;
	}
	public Integer getOnlySelectSelfSchool() {
		return onlySelectSelfSchool;
	}
	public void setOnlySelectSelfSchool(Integer onlySelectSelfSchool) {
		this.onlySelectSelfSchool = onlySelectSelfSchool;
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
	public Integer getCookie() {
		return cookie;
	}
	public void setCookie(Integer cookie) {
		this.cookie = cookie;
	}
	public Integer getResiDencePermit() {
		return resiDencePermit;
	}
	public void setResiDencePermit(Integer resiDencePermit) {
		this.resiDencePermit = resiDencePermit;
	}

}


