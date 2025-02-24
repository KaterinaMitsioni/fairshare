package com.example.fairshare;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PaymentRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * Retrieves all payments of a specific user from the database.
     * @param userID the ID of the user.
     * @return a list of payments for the given user.
     */
    public List<Payment> getPaymentsByUserId(int userID) {
            String sql = "SELECT p.PAYMENT_ID, p.USER_ID, u.USERNAME, p.AMOUNT, p.PAYER, p.PAYMENT_DATE \r\n" + //
                                "FROM PAYMENT p \r\n" + //
                                "JOIN USERS u ON p.USER_ID = u.USER_ID \r\n" + //
                                "WHERE p.USER_ID = ?";
            return jdbcTemplate.query(sql, new PaymentMapper(), userID);
        }
}


