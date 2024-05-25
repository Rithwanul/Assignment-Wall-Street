INSERT INTO test.tbl_customer
(age, customer_id, city, email, first_name, last_name, mobile, street)
VALUES(30, 0, 'Dhaka', 'rithwanul@gmail.com', 'T.M. Rithwanul', 'Islam', '+8801784949150', '25/13 Munshi Bari'),
      (46, 0, 'Dhaka', 'shoaib@gmail.com', 'Shoaib', 'Akhter', '+8801911612148', 'Road no: 15, Rupnagar R/A'),
      (19, 0, 'Rajshahi', 'james@gmail.com', 'James', 'Islam', '+8801718452369', '25/13 Munshi Bari');


INSERT INTO test.tbl_wish
(amount, fk_customer_id, product_item_id, wish_id, created_at, updated_at)
VALUES (200.45, 1, 0, 0, '2023-12-01T01:23:06', '2023-12-01T01:23:06'),
       (230.33, 1, 0, 0, '2023-12-01T01:23:06', '2023-12-01T01:23:06'),
       (50.05, 2, 0, 0, '2023-12-01T01:23:06', '2023-12-01T01:23:06');

INSERT INTO test.tbl_product
(base_amount, product_id, sell_amount, created_at, updated_at, product_name)
VALUES(30.25, 0, 45.25, '2023-12-01T01:23:06', '2023-12-01T01:23:06', 'Calculator'),
      (45.66, 0, 65.22, '2023-12-01T01:23:06', '2023-12-01T01:23:06', 'Flower Vase'),
      (12.50, 0, 15.30, '2023-12-01T01:23:06', '2023-12-01T01:23:06', 'Birthday Card');

# INSERT INTO test.tbl_product_item
# (base_amount, fk_wish_id, product_item_id, sell_amount, created_at, updated_at, product_item_name)
# VALUES(30.25, 1, 0, 45.25, '2023-12-01T01:23:06', '2023-12-01T01:23:06', 'Calculator'),
#       (45.66, 1, 0, 65.22, '2023-12-01T01:23:06', '2023-12-01T01:23:06', 'Flower Vase'),
#       (12.50, 2, 0, 15.30, '2023-12-01T01:23:06', '2023-12-01T01:23:06', 'Birthday Card');


INSERT INTO test.tbl_product_item_origin
(base_amount, product_item_origin_id, sell_amount, created_at, updated_at, product_item_origin_name)
VALUES(30.25, 0, 45.25, '2023-12-01T01:23:06', '2023-12-01T01:23:06', 'Calculator'),
      (45.66, 0, 65.22, '2023-12-01T01:23:06', '2023-12-01T01:23:06', 'Flower Vase'),
      (12.50, 0, 15.30, '2023-12-01T01:23:06', '2023-12-01T01:23:06', 'Birthday Card');


UPDATE tbl_product_item tpi
set tpi.product_item_origin_id = 1
where tpi.product_item_id = 1;

UPDATE tbl_product_item tpi
set tpi.product_item_origin_id = 3
where tpi.product_item_id = 2;

UPDATE tbl_product_item tpi
set tpi.product_item_origin_id = 2
where tpi.product_item_id = 3;

# INSERT INTO test.tbl_order
# (fk_customer_id, order_id, total_amount, created_at, updated_at)
# VALUES (1, 0, 45.25, '2023-12-01T01:23:06', '2023-12-01T01:23:06'),
#        (2, 0, 65.22, '2023-12-01T01:23:06', '2023-12-01T01:23:06'),
#        (3, 0, 15.3, '2023-12-01T01:23:06', '2023-12-01T01:23:06');

update tbl_product_item tpi
set tpi.fk_order_id = 1
WHERE tpi.product_item_id = 1;

update tbl_product_item tpi
set tpi.fk_order_id = 2
WHERE tpi.product_item_id = 2;

update tbl_product_item tpi
set tpi.fk_order_id = 3
WHERE tpi.product_item_id = 3;


