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
            String sql = "SELECT * FROM payment WHERE USER_ID = ?";
            return jdbcTemplate.query(sql, new PaymentMapper(), userID);
        }
}
