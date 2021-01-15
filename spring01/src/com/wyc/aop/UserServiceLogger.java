package com.wyc.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import java.util.Arrays;

/**
 * @ClassName UserServiceLogger
 * @Author 王韫琛
 * @Date 2021/1/12 14:57
 * @Version 1.0
 */
public class UserServiceLogger {
    //创建日志对象
    private Logger logger = Logger.getLogger(UserServiceLogger.class);
    /**
     * jp:连接点对象
     * 前置增强
     */
    public void before(JoinPoint jp){
        logger.info("前置增强=============>调用了"+jp.getTarget()+"的"+jp.getSignature().getName()+",方法参数列表"
                + Arrays.toString(jp.getArgs()));

    }
    /**
     * 后置增强
     * jp:连接点对象
     * result:返回结果
     */
    public void afterReturning(JoinPoint jp,Object result){
        logger.info("后置增强=============>调用了"+jp.getTarget()+"的"+jp.getSignature().getName()+",方法参数列表"
                + Arrays.toString(jp.getArgs())+"方法返回值类型:"+result);
    }
}
