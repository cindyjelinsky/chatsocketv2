package com.cindyhj.Webchatv2.model;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Setter
public class Message{
    private String sender;
    private String content;
}