INSERT INTO USER (user_id, name, email, surname, role, password) VALUES (1, 'Dmytro', 'user', 'Krupa', 0, '12dea96fec20593566ab75692c9949596833adc9');
INSERT INTO USER (user_id, name, email, surname, role, password) VALUES (2, 'Stepan', 'manager', 'Lys', 1, '1a8565a9dc72048ba03b4156be3e569f22771f23');

insert INTO  product (product_id, name, price, description, unitOfMeasurement) VALUES (1, 'Bread', 4, 'Testy bread', 'kilo');
insert INTO  product (product_id, name, price, description, unitOfMeasurement) VALUES (2, 'Cola', 8, 'Testy cola', 'bottle');
insert INTO  product (product_id, name, price, description, unitOfMeasurement) VALUES (3, 'Sugar', 13, 'Testy sugar', 'kilo');
insert INTO  product (product_id, name, price, description, unitOfMeasurement) VALUES (4, 'Vine', 200, 'Testy vine', 'bottle');
insert INTO  product (product_id, name, price, description, unitOfMeasurement) VALUES (5, 'Butter', 15, 'Testy butter', 'kilo');
insert INTO  product (product_id, name, price, description, unitOfMeasurement) VALUES (6, 'Chicken', 45, 'Testy chicken', 'kilo');
insert INTO  product (product_id, name, price, description, unitOfMeasurement) VALUES (7, 'Duck', 90, 'Testy duck', 'kilo');
insert INTO  product (product_id, name, price, description, unitOfMeasurement) VALUES (8, 'Liver', 30, 'Testy liver', 'kilo');
insert INTO  product (product_id, name, price, description, unitOfMeasurement) VALUES (9, 'Cheese', 40, 'Testy cheese', 'kilo');
insert INTO  product (product_id, name, price, description, unitOfMeasurement) VALUES (10, 'Apple', 3, 'Testy apple', 'kilo');
insert INTO  product (product_id, name, price, description, unitOfMeasurement) VALUES (11, 'Eggs', 1, 'Testy eggs', 'kilo');

insert into orders (order_id, user_id, paid) VALUES (1, 1, FALSE);


INSERT INTO ordersdetail (ordersDetail_id, numberOfProducts, order_id, product_id) VALUES (1, 1, 1, 1);