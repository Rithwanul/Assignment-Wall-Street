INSERT INTO test.tbl_customer
(age, customer_id, city, email, first_name, last_name, mobile, street)
VALUES(30, 0, 'Dhaka', 'rithwanul@gmail.com', 'T.M. Rithwanul', 'Islam', '+8801784949150', '25/13 Munshi Bari'),
      (46, 0, 'Dhaka', 'shoaib@gmail.com', 'Shoaib', 'Akhter', '+8801911612148', 'Road no: 15, Rupnagar R/A'),
      (19, 0, 'Rajshahi', 'james@gmail.com', '', 'Islam', '+8801718452369', '25/13 Munshi Bari');


INSERT INTO test.tbl_wish
(amount, fk_customer_id, product_item_id, wish_id, created_at, updated_at)
VALUES (200.45, 1, 0, 0, '2023-12-01T01:23:06', '2023-12-01T01:23:06'),
       (230.33, 1, 0, 0, '2023-12-01T01:23:06', '2023-12-01T01:23:06'),
       (50.05, 2, 0, 0, '2023-12-01T01:23:06', '2023-12-01T01:23:06');

