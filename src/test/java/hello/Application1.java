package hello;

import hello.Model;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
//@SpringBootTest(classes = Application.class)
@SpringBootTest
public class Application1 {

    @Autowired
    Model model;
    @Autowired
    @Qualifier("testbean")
    Model testbean;
    @Autowired
    ApplicationContext ioc;
    @Test
    public void contextLoad(){
        System.out.println(model.getP1());
        System.out.println(testbean.getP1());
        System.out.println(ioc.getBean("testbean"));
    }

}
