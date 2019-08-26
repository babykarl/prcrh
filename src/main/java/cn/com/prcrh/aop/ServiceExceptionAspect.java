package cn.com.prcrh.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import cn.com.prcrh.model.exception.ResultUtils;
import cn.com.prcrh.util.ResultCode;

/**
* @author karl E-mail:1834007615@qq.com
* @version 创建时间：2019年8月14日 上午9:29:09
* 类说明
*/
@Aspect
@Component
public class ServiceExceptionAspect {
 
    @Around("execution(* cn.com.prcrh..*.*(..))")//切点表达式以及通知类型
    public Object around(ProceedingJoinPoint joinPoint){//通过joinPoint对象获取参数以及其他对象信息
        Object result = null;
        try {
            result = joinPoint.proceed();
        } catch (Throwable e) {
            if(ResultCode.contains(e.getMessage())){
                return ResultUtils.setError(ResultUtils.getResultCodeByName(e.getMessage()));
            }
            Object[] args = joinPoint.getArgs();
            StringBuffer stringBuffer = new StringBuffer();
            for (Object  ob :args){
                stringBuffer.append(ob);
                stringBuffer.append(",");
            }
            return ResultUtils.setError(ResultCode.SYSTEM_ERROR);
        }
        return result;
    }

}


