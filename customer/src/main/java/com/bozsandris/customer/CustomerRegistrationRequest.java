package com.bozsandris.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
