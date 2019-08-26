
package cn.com.prcrh.model.db;

import java.util.Date;

/**
* @author karl E-mail:1834007615@qq.com
* @version 创建时间：2019年8月20日 下午8:36:57
* 类说明
*/

public class CityDistrict {
	/**
	 * 主键id
	 */
	private String id;
	/**
	 * 地区名称
	 */
	private String name;
	/**
	 * 街道名称
	 */
	private String partDistrict;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPartDistrict() {
		return partDistrict;
	}
	public void setPartDistrict(String partDistrict) {
		this.partDistrict = partDistrict;
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


