package com.cindyhj.Webchatv2.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.cindyhj.Webchatv2.model.Message;

@Controller
public class ChatController {


   
    @MessageMapping("/send")
    @SendTo("/topic/chatRoom")
    public Message sendMessage(@Payload Message message){
        if(message!=null){
            System.out.println(message.getName()+": " + message.getContent());
           
        }else{
            System.out.println("Error recieving message");
        }
        return new Message();
    }


    @MessageMapping("/chat") // Mapeia conexões de clientes
    public void handleSubscription(Message client) {
        if (client != null) {
            System.out.println("Client connected: " + client.getName());
        } else {
            System.out.println("Error connecting...");
        }
    }
}
