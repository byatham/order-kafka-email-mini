
# 🛍️ Kafka Order → Email Microservices Demo

This is a mini microservices demo using **Spring Boot** and **Apache Kafka**.

## 🔄 Flow

1. `order-service` exposes a REST API to place an order.
2. It sends an `OrderEvent` to Kafka.
3. `email-service` listens to the Kafka topic and logs a mock email confirmation.

## 🧰 Tech Stack

- Java 17
- Spring Boot 3
- Spring Kafka
- Docker Compose (Kafka/Zookeeper)

## 🚀 Run the Project

### 1. Start Kafka
```bash
docker-compose up -d
```

### 2. Run both services
Start `order-service` and `email-service` (via IDE or terminal)

### 3. Test the API
```bash
curl -X POST http://localhost:8080/orders \
  -H "Content-Type: application/json" \
  -d '{"orderId":"123", "userEmail":"test@example.com", "product":"Laptop", "amount":999.99}'
```

Check the `email-service` logs — you'll see a mock email sent!

## 🛠️ Improvements You Can Try

- Add persistence (PostgreSQL, MongoDB)
- Implement retry/DLT
- Add Avro schema registry
- Add Prometheus/Grafana for monitoring
