package com.yashasvi.paymentservice.services;

import com.yashasvi.paymentservice.exceptions.PaymentGatewayException;

public interface PaymentService {
    String createPaymentLink(String orderId) throws PaymentGatewayException;

    String getPaymentStatus(String paymentId);

    void handleWebhookEvent(String payload);
}
