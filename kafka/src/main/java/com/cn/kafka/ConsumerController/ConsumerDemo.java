
package com.cn.kafka.ConsumerController;

import cn.hutool.json.JSONObject;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;



@Component
public class ConsumerDemo {

    /**
     * 定义此消费者接收topics = "demo"的消息，与controller中的topic对应上即可
     * @param record 变量代表消息本身，可以通过ConsumerRecord<?,?>类型的record变量来打印接收的消息的各种信息
     */

    @KafkaListener(topics = "top1")
    public void listen (ConsumerRecord<String,String> record){

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("topic",record.topic());
        jsonObject.put("data",record.value());

        System.out.println(jsonObject);


    }
}

