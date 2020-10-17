package com.kodilla.patterns22.facade;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class OrderWather {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderWather.class);

    @Before("execution(* com.kodilla.patterns22.facade.api.OrderFacade.processOrder(..))")
    public void logEvent()  { LOGGER.info("LLLLLLLLLLLLLogging the event");}
}
