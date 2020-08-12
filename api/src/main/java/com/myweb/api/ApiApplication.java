package com.myweb.api;

//import javax.jms.Queue;
//import org.apache.activemq.command.ActiveMQQueue;
import com.myweb.api.jms.PersonaSender;
import com.myweb.api.model.Persona;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
//@EnableJms
public class ApiApplication {
    
    private static Logger log = LoggerFactory.getLogger(ApiApplication.class);

    @Autowired
    private PersonaSender personaSender;

    public void run(ApplicationArguments applicationArguments) throws Exception {
        log.info("Spring Boot ActiveMQ Queue Point to Point Configuration Example");

        for (int i = 0; i < 5; i++) {
            Persona persona= new Persona();
            personaSender.sendQueue(persona);
        }

        log.info("Waiting for all ActiveMQ JMS Messages to be consumed");
        TimeUnit.SECONDS.sleep(3);
        System.exit(-1);
    }

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

    

    /*
    @Bean
    public Queue queue() {
        return new ActiveMQQueue("message.queue");
    }*/
}
