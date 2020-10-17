package com.kodilla.patterns22.facade.api;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OrderWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderWatcher.class);

    @Before("execution(* com.kodilla.patterns22.facade.api.OrderFacade.processOrder(..))")
      public void logEvent() {
        LOGGER.info("LLLLLLLLLLLLLLLLoging the event");
    }

@Around("execution(* com.kodilla.patterns22.facade.api.OrderFacade.processOrder(..))")
    public Object measureTime(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try {
            long begin =System.currentTimeMillis();
            result = proceedingJoinPoint.proceed();
            long end = System.currentTimeMillis();
            LOGGER.info("Timeeeeeeeeeeeeeeee consumed:  "+(end-begin)+"[ms]");
        } catch (Throwable throwable) {
            LOGGER.error(throwable.getMessage());
            throw throwable;
        }
        return result;
    }
}

// + "&& args(thrNumber) && target(object)")
//    public void logEvent(BigDecimal thrNumber,Object object) {
//        LOGGER.info("LLLLLLLLLLLLLLLLoging the event"+object.getClass().getName(),thrNumber);
//    }