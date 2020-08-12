package org.com.example.springboot;
import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;


@Component
public class MessageCreator implements CommandLineRunner {

        //Enviar mensajes a la cola 
	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;
        

	@Autowired
	private Queue queue;

	public void run(String... arg0) throws Exception {
		// Colocando el mensaje en la cola
		this.jmsMessagingTemplate.convertAndSend(this.queue, "Hola mundo!!");
		System.out.println("El emisor ha colocado el mensaje en la cola");
	}
}