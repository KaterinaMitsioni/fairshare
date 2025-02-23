package com.example.fairshare;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PaymentMapper implements RowMapper<Payment> {
    @Override
    public Payment mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Payment(
            rs.getInt("PAYMENT_ID"),
            rs.getString("PAYER"),
            rs.getDouble("AMOUNT"),
            rs.getDate("PAYMENT_DATE")
        );
    }
}