package com.wqs.jsd.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @Author: wan
 * @Date: Created in 15:45 2020/3/3
 * @Description:
 * @Modified By:
 */
@Aspect
@Component
public class WebLogAspect {
    private final Logger logger = LoggerFactory.getLogger(WebLogAspect.class);

    @Pointcut("execution(public * com.wqs.jsd.controller.*.*(..))") // 切入点描述
    public void myPointCut(){} // 命名切入点

    // 前置通知
    @Before("myPointCut()")
    public void logBeforeController(JoinPoint joinPoint) {
        // 获取RequestAttributes
        RequestAttributes attributes = RequestContextHolder.getRequestAttributes();
        assert attributes != null;
        // 从获取RequestAttributes中获取HttpServletRequest的信息
        HttpServletRequest request = ((ServletRequestAttributes)attributes).getRequest();
        // 记录请求内容
        logger.info("###URL : " + request.getRequestURL().toString());
        logger.info("###HTTP_METHOD : " + request.getMethod());
        logger.info("###IP : " + request.getRemoteAddr());
        logger.info("###THE ARGS OF THE CONTROLLER : " + Arrays.toString(joinPoint.getArgs()));

        // getSignature().getDeclaringTypeName() 获取包+类名的
        // joinPoint.getSignature.getName() 获取方法名
        logger.info("###CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        //logger.info("###TARGET: " + joinPoint.getTarget());// 返回需要加强的目标类的对象
        //logger.info("###THIS: " + joinPoint.getThis());// 返回经过加强后的代理类的对象
    }

    // 后置通知
    @AfterReturning(value = "myPointCut()")
    public void logAfterReturningController(JoinPoint joinPoint) {}

    /**
     * 环绕通知
     * ProceedingJoinPoint是JoinPoint的子接口，可表示执行目标方法
     * 必须是Object类型的返还值
     * 必须接受一个参数，类型为ProceedingJoinPoint
     * 必须throws Throwable
     */
    @Around("myPointCut()")
    public Object logAroundController(ProceedingJoinPoint point) throws Throwable {
        Object obj = point.proceed();
        return obj;
    }

    // 异常通知
    @AfterThrowing(value = "myPointCut()", throwing = "e")
    public void logAfterThrowingController(JoinPoint joinPoint, Throwable e) {}

    // 最终通知
    @After("myPointCut()")
    public void logAfterController() {}
}
