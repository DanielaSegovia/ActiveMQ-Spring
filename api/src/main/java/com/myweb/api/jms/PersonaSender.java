/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myweb.api.jms;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import static com.myweb.api.config.config.PERSONA_QUEUE;
import com.myweb.api.model.Persona;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

/**
 *
 * @author Daniela Segovia
 */
@Service
public class PersonaSender {

    private static Logger log = LoggerFactory.getLogger(PersonaSender.class);

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendQueue(Persona persona) {
        log.info("Sending to the queue <" + persona + ">");
        jmsTemplate.convertAndSend(PERSONA_QUEUE, persona);
    }
    /*
    ObjectMapper Obj = new ObjectMapper();

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendPerson(Persona persona) {
        try {
            String jsonStr = Obj.writeValueAsString(persona);
            System.out.println(jsonStr);
            jmsTemplate.convertAndSend(PERSONA_QUEUE, jsonStr);
            System.out.println("### Message Successfully Pushed into Queue ###");

        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }*/
}
