package com.example.kafkapub.publish;

import com.example.common.domain.OrderInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Component
@Slf4j
public class OrderProducer {
    @Autowired
    private KafkaTemplate<String, OrderInfo> orderKafkaTemplate;

    @Value(value = "${kafka.producer.topic.orderStatus}")
    private String orderStatusTopicName;

    public void sendMessage(OrderInfo greeting) {
        ListenableFuture<SendResult<String, OrderInfo>> future = orderKafkaTemplate.send(orderStatusTopicName, greeting);

        future.addCallback(new ListenableFutureCallback<SendResult<String, OrderInfo>>() {
            @Override
            public void onSuccess(SendResult<String, OrderInfo> result) {
                OrderInfo orderInfo = result.getProducerRecord().value();
                log.info("Sent message=[{}] with offset=[{}]", orderInfo.toString(), result.getRecordMetadata().offset());
            }

            @Override
            public void onFailure(Throwable ex) {
                log.info( "Unable to send message=[{}] due to : {}", greeting.toString(), ex.getMessage());
            }
        });
    }
}
