/* Payments Data */
/*PAYMENT_ID, PAYMENT_DATE, AMOUNT, SPLIT_TYPE, PAYMENT_TYPE, PAYER, BORROWERS, SPLIT_AMOUNTS, USER_ID */
-- INSERT INTO payment VALUES (101, '2025-01-02 00:00:00', 32.00, 1, 'general', 'mariabr', NULL, NULL, 1),
INSERT INTO payment (PAYMENT_ID, PAYER, AMOUNT, PAYMENT_DATE) VALUES (102, 'mariabr', 40, '2025-01-02');



/* Users Data */
INSERT INTO users VALUES (1,'katerina', 'katerina2!', 'katerina@gmail.com');
INSERT INTO users VALUES (2, 'mariabr', '12345678', 'mariabr@gmail.com');
INSERT INTO users VALUES (3, 'fraaaag', '987654321', 'frag@gmail.com');