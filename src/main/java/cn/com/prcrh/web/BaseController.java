
package cn.com.prcrh.web;

import java.util.List;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import cn.com.prcrh.aop.BusinessException;
import cn.com.prcrh.util.enums.ErrorMessage;

/**
* @author karl E-mail:1834007615@qq.com
* @version 创建时间：2019年8月14日 下午2:09:43
* 类说明
*/

public abstract class BaseController {
    /**
     * 判断是否存在检验未通过
     * 
     * @param result
     *            数据校验结果
     */
    protected void checkValidation(BindingResult result) {
        if (result.hasErrors()) {
            StringBuilder errorMsg = new StringBuilder();
            List<FieldError> fieldErrors = result.getFieldErrors();
            for (int i = 0; i < fieldErrors.size(); i++) {
                String singalErrorMsg = fieldErrors.get(i).getDefaultMessage();
                errorMsg.append(singalErrorMsg);
                // 当前信息为最后一条时不添加分隔符
                if (i != fieldErrors.size() - 1) {
                    errorMsg.append("; ");
                }
            }
            throw new BusinessException(ErrorMessage.INVALID_JSON_MSG.getCode(), errorMsg.toString());
        }
    }

}


