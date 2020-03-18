package com.cn.kafka.ProducerController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class ProducerController {

    @Autowired
    private KafkaTemplate kafkaTemplate;


    @GetMapping("/send")
    public void send(String topic, String json){
        kafkaTemplate.send(topic, json); //使用kafka模板发送信息

    }
}
