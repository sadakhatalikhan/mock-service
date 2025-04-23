package com.mock.service.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.mock.service.controller.*.*(..))")
    public void logBeforeMethodExecution(JoinPoint joinPoint) {
        System.out.println("Request Payload - " + joinPoint.getSignature().getName() +
                joinPoint.getSignature());
    }
}