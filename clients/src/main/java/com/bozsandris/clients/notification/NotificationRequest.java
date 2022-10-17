package com.bozsandris.clients.notification;

public record NotificationRequest(
        Integer customerId,
        String toCustomerEmail,
        String message
) {
}