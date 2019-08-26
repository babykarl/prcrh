
package cn.com.prcrh.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.prcrh.aop.BusinessException;
import cn.com.prcrh.dao.WeiXinDao;
import cn.com.prcrh.model.db.UserInfo;
import cn.com.prcrh.model.user.UserInfoResp;
import cn.com.prcrh.util.Tools;
import cn.com.prcrh.util.WeiXinConfig;
import cn.com.prcrh.util.enums.ErrorMessage;
import cn.com.prcrh.util.enums.UserStatus;
import cn.com.prcrh.wxapi.WeiXin;

/**
* @author karl E-mail:1834007615@qq.com
* @version 创建时间：2019年8月13日 下午6:41:06
* 类说明
*/
@Service("weiXinService")
public class WeiXinService {
	
	@Autowired
	private WeiXinDao weiXinDao;

	/**
	 * @param request
	 * @return 
	 * @throws BusinessException 
	 * @throws Exception 
	 */
	public UserInfoResp getOpenId(HttpServletRequest request) {
		String code = request.getParameter("code");
		if (code == null) {
			throw new BusinessException(ErrorMessage.INVALID_PARAMETER.getCode(),"code为null");
		}
		String openId = WeiXin.getOpenIdByCode(code);
		if (openId == null) {
			throw new BusinessException(ErrorMessage.INVALID_PARAMETER.getCode(),"open_id为空");
		}
		String id = weiXinDao.selectUserInfoByOpenId(openId);
		if (id == null) {
			try{
				UserInfo userInfo = new UserInfo();
				userInfo.setAppId(WeiXinConfig.MINI_PROGRAM_APP_ID);
				userInfo.setId(Tools.getUUID());
				userInfo.setOpenId(openId);
				userInfo.setStatus(UserStatus.USED.getStatus());
				userInfo.setCrtTime(Tools.getDate());
				userInfo.setUpdTime(Tools.getDate());
				weiXinDao.insertUserInfo(userInfo);
			}catch (Exception e) {
				throw new BusinessException(ErrorMessage.UNEXPECTED_ERROR.getCode(),"用户注册失败");
	
			}
		}
		UserInfoResp userInfoResp = new UserInfoResp();
		userInfoResp.setOpenId(openId);
		return userInfoResp;
	}

}


