
package cn.com.prcrh.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.prcrh.model.BusinessResultData;
import cn.com.prcrh.model.user.BalumasRequest;
import cn.com.prcrh.model.user.BalumasResp;
import cn.com.prcrh.service.BalumasService;
import cn.com.prcrh.util.Constant;
import cn.com.prcrh.util.Tools;

/**
* @author karl E-mail:1834007615@qq.com
* 
* @version 创建时间：2019年8月20日 下午8:42:09
* 
* 校友相关信息操作
*/
@Controller
public class BalumasController extends BaseController {
	
	private final static Logger logger = LoggerFactory.getLogger(BalumasController.class);
	
	@Autowired
	private BalumasService balumasService;
	
	@RequestMapping(value = "aaa", method = RequestMethod.GET)
	@ResponseBody
	public BusinessResultData findBalumasInfo(@Valid BalumasRequest request, BindingResult bindingResult){
		logger.info(Tools.getUUID());
        /* 校验请求数据 */
        checkValidation(bindingResult);
        /* 调用服务层 */
        BalumasResp balumasResp = balumasService.findBalumasInfo(request);
        BusinessResultData respBody = new BusinessResultData(Constant.SUCCESS, Constant.NOTIFY_SUCCESS, balumasResp);
		return respBody;
	}

}


