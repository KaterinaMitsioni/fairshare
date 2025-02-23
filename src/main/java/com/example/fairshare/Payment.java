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
    private String paymentType;
    private Double amount;
    private Date date;
    private Boolean splitType;
    private String usernamePayer;
    private List<User> borrowers;
    private List<Double> split_amounts;

    public Payment(int paymentID,Date date, Double amount, String paymentType,
            Boolean splitType, String usernamePayer, List<User> borrowers, List<Double> splitAmounts) {
        this.paymentID = paymentID;
        this.amount = amount;
        this.paymentType = paymentType;
        this.date = date;
        this.splitType = splitType;
        this.usernamePayer = usernamePayer;
        this.borrowers = borrowers;
        this.split_amounts = splitAmounts;
    }

    public Payment(Double amount, String paymentType, Date date,
            Boolean splitType, String usernamePayer) {
        this.amount = amount;
        this.paymentType = paymentType;
        this.date = date;
        this.splitType = splitType;
        this.usernamePayer = usernamePayer;
    }

    public Payment(int paymentID, String usernamePayer, Double amount, Date date) {
        this.usernamePayer = usernamePayer;
        this.amount = amount;
        this.date = date;
        this.paymentID = paymentID;
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

    public void setBorrowers(List<User> borrowers) {
        this.borrowers = borrowers;
    }

    public List<User> getBorrowers() {
        return borrowers;
    }

    public void setSplitAmounts(List<Double> split_amounts) {
        this.split_amounts = split_amounts;
    }

    public List<Double> getSplitAmounts() {
        return split_amounts;
    }

    public void addSingleBorrower(User borrower) {
        if (this.borrowers == null) {
            this.borrowers = new ArrayList<>();
        }
        this.borrowers.add(borrower);
    }

    public void addBorrower(List<User> newBorrowers) {
        if (this.borrowers == null) {
            this.borrowers = new ArrayList<>();
        }
        this.borrowers.addAll(newBorrowers);
    }

}