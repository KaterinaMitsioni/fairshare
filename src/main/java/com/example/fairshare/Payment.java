package com.example.fairshare;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Payment Class.
 * Represents a Payment.
 */

public class Payment {
    private int paymentID;
    private int userID;
    private String paymentType;
    private Double amount;
    private Date date;
    private Boolean splitType;
    private String usernamePayer;

    public Payment(Double amount, String paymentType, Date date,
            Boolean splitType, String usernamePayer) {
        this.amount = amount;
        this.paymentType = paymentType;
        this.date = date;
        this.splitType = splitType;
        this.usernamePayer = usernamePayer;
    }

    public Payment(int paymentID, String usernamePayer, Double amount, Date date, int userID) {
        this.usernamePayer = usernamePayer;
        this.amount = amount;
        this.date = date;
        this.paymentID = paymentID;
        this.userID = userID;
    }


    public void setPaymentID(int id) {
        this.paymentID = id;
    }

    public int getPaymentID() {
        return paymentID;
    }


    public void setPaymentType(String type) {
        this.paymentType = type;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setSplitType(Boolean splitType) {
        this.splitType = splitType;
    }

    public Boolean getSplitType() {
        return splitType;
    }

    public void setUsernamePayer(String usernamePayer) {
        this.usernamePayer = usernamePayer;
    }

    public String getUsernamePayer() {
        return usernamePayer;
    }
}