package com.prueba.apache.kafka.recived;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class RecivedKafka {

    @KafkaListener(topics = "test", groupId = "foo")
    public String listenGroupFoo(String message) {

        String respuesta = "Received Message in group foo: " + message ;
        System.out.println("Mensaje:" + message);

        return respuesta;
    }

}
