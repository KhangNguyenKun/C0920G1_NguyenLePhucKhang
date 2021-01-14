package cg.wbd.grandemonstration.config;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Logger {
    @AfterThrowing(pointcut = "execution(public * cg.wbd.grandemonstration.service.CustomerService.*(..))")
    public void error() {
        System.out.println("[CMS] ERROR!");
    }


}
