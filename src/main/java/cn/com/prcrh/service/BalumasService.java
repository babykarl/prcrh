
package cn.com.prcrh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.prcrh.aop.BusinessException;
import cn.com.prcrh.dao.BalumasDao;
import cn.com.prcrh.dao.UserInfoDao;
import cn.com.prcrh.model.user.BalumasRequest;
import cn.com.prcrh.model.user.BalumasResp;
import cn.com.prcrh.model.user.BalumasSelect;
import cn.com.prcrh.util.enums.ErrorMessage;
import cn.com.prcrh.util.enums.SchoolVerify;

/**
* @author karl E-mail:1834007615@qq.com
* 
* @version 创建时间：2019年8月20日 下午9:07:09
* 
* 校友相关信息的业务处理
*/
@Service
public class BalumasService {
	
	/**
	 * 用户先关信息操作DAO
	 */
	@Autowired
	private UserInfoDao userInfoDao;
	
	@Autowired
	private BalumasDao balumasDao;
	/**
	 * @param request
	 * @return
	 */
	public BalumasResp findBalumasInfo(BalumasRequest request) {
		Integer schoolVerify = userInfoDao.selectSchoolVerifyByUserId(request.getUserId());
		if (schoolVerify != SchoolVerify.USED.getStatus()) {
			throw new BusinessException(ErrorMessage.UN_SCHOOL_VERIFY.getCode(),"未校友认证，请先去认证");
		}
		BalumasSelect balumasSelect = balumasDao.findBalumasInfo(request);
		return null;
	}

}


