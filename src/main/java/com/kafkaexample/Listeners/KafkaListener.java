package com.kafkaexample.Listeners;

import org.springframework.stereotype.Component;

@Component
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(
            topics = "topic",
            groupId = "groupId1"
    )
    void listener1(String data){
        System.out.println("Listener received - groupId1: " + data);
    }

    @org.springframework.kafka.annotation.KafkaListener(
            topics = "topic",
            groupId = "groupId2"
    )
    void listener2(String data){
        System.out.println("Listener received - groupId2: " + data);
    }
}
