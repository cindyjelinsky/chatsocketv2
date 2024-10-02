package com.cindyhj.Webchatv2.controller;

import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Controller;

import com.cindyhj.Webchatv2.model.Message;

@Controller
public class ChatController {


    //private boolean isConnected =false;

    
    
    public Message sendMessage(@Payload Message message){
        if(message.getSender().isEmpty()){
            System.out.println("Connection Failed");
        }else{
            System.out.println("Connection Successful!\n");
           
        }
        System.out.println("Client Message: " + message);
        return message;
       
    }
}
