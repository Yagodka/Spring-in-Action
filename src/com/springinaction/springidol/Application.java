package com.springinaction.springidol;

import com.springinaction.springidol.models.performers.Performer;
import com.springinaction.springidol.util.PerformanceException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) throws PerformanceException {

        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "com/springinaction/springidol/spring-idol.xml");
        ((Performer) ctx.getBean("poeticDuke")).perform();
        ((Performer) ctx.getBean("kenny")).perform();
        ((Performer) ctx.getBean("onemanband")).perform();
        ((Performer) ctx.getBean("david")).perform();
        System.out.println("-------------------------------");
        ((Performer) ctx.getBean("harry")).perform();
    }
}
