
package com.example.common;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEvent {
    private String orderId;
    private String userEmail;
    private String product;
    private double amount;
}
