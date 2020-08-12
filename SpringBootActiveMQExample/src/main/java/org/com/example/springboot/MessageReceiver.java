package org.com.example.springboot;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

        //Anotación para marcar un método como destino de un remitente de mensaje
	@JmsListener(destination = "message.queue")
        //Recibiendo como parámetro el texto
	public void receiveQueue(String text) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Mensaje recibido: "+ text);
	}
        
}
