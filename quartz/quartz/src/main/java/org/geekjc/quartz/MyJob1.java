package org.geekjc.quartz;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author ll
 * @date 2019年09月26日 7:35 PM
 */
@Component
public class MyJob1 {
    public void sayHello() {
        System.out.println("MyJob1>>>" + new Date());
    }
}
