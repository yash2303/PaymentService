package com.yashasvi.paymentservice.controllers;

import com.razorpay.RazorpayException;
import com.razorpay.Webhook;
import com.yashasvi.paymentservice.dtos.CreatePaymentLinkRequestDto;
import com.yashasvi.paymentservice.exceptions.PaymentGatewayException;
import com.yashasvi.paymentservice.services.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(@Qualifier("razorpayPaymentService") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/")
    public String createPaymentLink(@RequestBody CreatePaymentLinkRequestDto createPaymentLinkRequestDto) throws PaymentGatewayException {
        return paymentService.createPaymentLink(createPaymentLinkRequestDto.getOrderId());
    }

    @PostMapping("/webhook")
    public void handleWebhookEvent(@RequestBody Webhook webhook) {
        System.out.println(webhook.toString());
    }
}
