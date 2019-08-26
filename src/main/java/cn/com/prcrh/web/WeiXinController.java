package cn.com.prcrh.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.prcrh.model.BusinessResultData;
import cn.com.prcrh.model.user.UserInfoResp;
import cn.com.prcrh.service.WeiXinService;
import cn.com.prcrh.util.Constant;

/**
* @author karl E-mail:1834007615@qq.com
* @version 创建时间：2019年8月13日 下午6:09:09
* 类说明
*/
@Controller
public class WeiXinController extends BaseController {

	@Autowired
	private WeiXinService weiXinService;
	
	/**
	 * 用户登录
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/login.action")
	@ResponseBody
	public BusinessResultData weiXinLogin(HttpServletRequest request,HttpServletResponse response){
		
		UserInfoResp userInfoResp = weiXinService.getOpenId(request);
		BusinessResultData respBody = new BusinessResultData(Constant.SUCCESS, Constant.NOTIFY_SUCCESS, userInfoResp);
		return respBody;
	}
	
	
	
}

