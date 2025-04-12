
package com.example.orderservice.controller;

import com.example.common.OrderEvent;
import com.example.orderservice.producer.KafkaOrderProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderController {

    private final KafkaOrderProducer producer;

    @PostMapping
    public ResponseEntity<String> placeOrder(@RequestBody OrderEvent order) {
        producer.sendOrderEvent(order);
        return ResponseEntity.ok("Order placed successfully!");
    }
}
