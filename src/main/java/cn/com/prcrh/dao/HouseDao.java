
package cn.com.prcrh.dao;

import java.util.List;

import cn.com.prcrh.model.house.CitySelect;
import cn.com.prcrh.model.house.DistirctSelect;
import cn.com.prcrh.model.house.HouseReq;
import cn.com.prcrh.model.house.HouseResp;
import cn.com.prcrh.model.house.MetroSelect;

/**
* @author karl E-mail:1834007615@qq.com
* @version 创建时间：2019年8月14日 下午3:36:06
* 类说明
*/

public interface HouseDao {
	
	/**
	 * 寻找房东发布的房源
	 */
	List<HouseResp> findRootHouse(HouseReq houseReq);
	/**
	 * 寻找中介发布的房源
	 */
	List<HouseResp> findProxyHouse(HouseReq houseReq);
	/**
	 * 寻找转租人发布的房源
	 */
	List<HouseResp> findSubletHouse(HouseReq houseReq);
	
	/**
	 * 查询地铁线路
	 * @param cityId
	 * @return
	 */
	List<MetroSelect> findMetroInfo(String cityId);
	
	/**
	 * 查询地铁线路
	 * @param cityId
	 * @return
	 */
	List<DistirctSelect> findDistirctInfo(String cityId);
	
	/**
	 * 查找城市
	 * @return
	 */
	List<CitySelect> findCityInfo();
}


