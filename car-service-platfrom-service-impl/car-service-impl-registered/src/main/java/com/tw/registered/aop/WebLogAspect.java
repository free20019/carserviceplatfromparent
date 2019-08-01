package com.tw.registered.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@Aspect
@Component
@Slf4j
public class WebLogAspect {
    @Pointcut("execution(public * com.tw.registered.control.*.*(..))")
    public void webLog(){

    }
    /*
    * 前置通知
    * */
    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable{
        //接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //记录下请求内容
        /*log.info("URL : "+request.getRequestURI().toString());
        log.info("HTTP_METHOD : "+request.getMethod());
        log.info("IP : "+request.getRemoteAddr());*/
        Enumeration<String> enu = request.getParameterNames();
        while(enu.hasMoreElements()){
            String name = (String)enu.nextElement();
            log.info(""+name+":"+request.getParameter(name));
            //log.info(" name:{},value:{}",name,request.getParameter(name));
        }
    }
    /*
     * 后置通知
     * */
    @AfterReturning(returning = "ret",pointcut = "webLog()")
    public void doAfterReturing(Object ret) throws Throwable{
        //log.info("后置通知 : "+ret);
    }
}
