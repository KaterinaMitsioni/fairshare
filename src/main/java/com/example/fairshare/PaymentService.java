package com.example.fairshare;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    @Autowired
    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    
    public List<Payment> getPaymentsByUserId(int userID) {
        return paymentRepository.getPaymentsByUserId(userID);
    }
}
