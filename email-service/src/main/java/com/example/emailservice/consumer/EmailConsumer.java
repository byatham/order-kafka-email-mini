
package com.example.emailservice.consumer;

import com.example.common.OrderEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    @KafkaListener(topics = "order-topic", groupId = "email-service")
    public void consume(OrderEvent event) {
        System.out.println("📩 Sending email to: " + event.getUserEmail());
        System.out.println("✅ Order Confirmed: " + event.getProduct() + " | Amount: $" + event.getAmount());
    }
}
