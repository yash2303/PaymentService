package com.yashasvi.paymentservice.exceptions;

public class PaymentGatewayException extends Exception {
    public PaymentGatewayException(Exception e) {
        super(e);
    }
}
