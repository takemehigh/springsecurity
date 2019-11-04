package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;

@SpringBootApplication
@ImportResource(locations={"classpath:mvc/mvc-test1.xml"})
public class Application {

    @Autowired
    public Model model;

    public static void main(String[] args) throws Throwable {
        SpringApplication.run(Application.class, args);
        //System.out.println(model.getP1());
    }

}
