package com.example.kafkasub.consume;

import com.example.common.domain.OrderInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class OrderInfoConsumer {

    @KafkaListener(topics = "${kafka.consumer.topic.orderStatus}", containerFactory = "orderInfoKafkaListenerContainerFactory")
    public void greetingListener(OrderInfo orderInfo, Acknowledgment ack) {
        try {
            log.info("Recieved greeting message: {}", orderInfo);

//            if (1 < 0) {
//                throw new Exception("예제를 위한 에러 발생");
//            }
            ack.acknowledge();
        } catch (Exception e) {
        }
    }
}
