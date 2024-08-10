# Payment Service

## Overview
This project is a Spring Boot application that provides payment services using the Razorpay payment gateway. It includes functionalities to create payment links, check payment status, and handle webhook events.

## Technologies Used
- Java
- Spring Boot
- Maven
- Razorpay API

## Project Structure
- `src/main/java/com/yashasvi/paymentservice/`: Contains the main application code.
  - `exceptions/`: Custom exception classes.
  - `services/`: Service interfaces and implementations.
- `src/test/manual/`: Contains manual test files.

## Setup and Installation

1. **Clone the repository:**
   ```sh
   git clone https://github.com/yash2303/PaymentService.git
   cd paymentservice
   ```

2. **Build the project:**
   ```sh
   mvn clean install
   ```

3. **Run the application:**
   ```sh
   mvn spring-boot:run
   ```

## Configuration
Ensure you have the following configurations in your `application.properties` or `application.yml`:
```properties
razorpay.key=<your-razorpay-key>
razorpay.secret=<your-razorpay-secret>
server.port=8282
```

## Usage

### Create Payment Link
To create a payment link, send a POST request to `http://localhost:8282/payment/` with the following JSON payload:
```json
{
  "orderId": "1234"
}
```

### Check Payment Status
To check the payment status, implement the `getPaymentStatus` method in `RazorpayPaymentService`.

### Handle Webhook Events
To handle webhook events, implement the `handleWebhookEvent` method in `RazorpayPaymentService`.

## Manual Testing
You can use the `src/test/manual/payment.http` file to manually test the payment link creation.

## License
This project is licensed under the MIT License.
