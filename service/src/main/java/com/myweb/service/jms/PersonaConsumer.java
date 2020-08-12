/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myweb.service.jms;

import static com.myweb.service.config.config.PERSONA_QUEUE;
import com.myweb.service.model.Persona;
import javax.jms.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 *
 * @author Daniela Segovia
 */
@Component
public class PersonaConsumer {

    private static Logger log = LoggerFactory.getLogger(PersonaConsumer.class);

    @JmsListener(destination = PERSONA_QUEUE)
    public void receiveMessage(@Payload Persona persona,
            @Headers MessageHeaders headers,
            Message message,
            Session session) {

        log.info("Received <" + persona+ ">");
    }
    
    /*

     @Autowired
    private SedeServiceFacade sedeServiceFacade;

    ObjectMapper objectMapper = new ObjectMapper();

    @JmsListener(destination = SEDE_TOPIC)
    public void listener(String jsonInString) throws IOException {

        sedeServiceFacade.save(objectMapper.readValue(jsonInString, SedeDTO.class));

        Logger.getLogger(SedeConsumer.class.getName()).log(Level.SEVERE, null, "Message received {} " + jsonInString);

        // log.info("received <" + order + ">");
    }*/
}
