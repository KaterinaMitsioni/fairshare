package com.example.fairshare;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class HistoryController {

    private final PaymentService paymentService;

    public HistoryController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("history/{userID}")
    public String showHistoryPage(@PathVariable("userID") int userID, Model model) {
        List<Payment> payments = paymentService.getPaymentsByUserId(userID);
        model.addAttribute("payments", payments);
        model.addAttribute("userID", userID);
        return "history"; 
    }
}
