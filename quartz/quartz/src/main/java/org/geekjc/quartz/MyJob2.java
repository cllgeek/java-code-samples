package org.geekjc.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @author ll
 * @date 2019年09月26日 7:47 PM
 */
public class MyJob2 extends QuartzJobBean {
    HelloService helloService;

    public HelloService getHelloService() {
        return helloService;
    }

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        helloService.sayHello();
    }
}
