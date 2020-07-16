CREATE TABLE IF NOT EXISTS buyer
(id_buyer integer NOT NULL,
 number_passport_buyer integer NOT NULL,
 full_name_buyer varchar(100) NOT NULL,
 telephone_buyer varchar(50),
 place_job varchar(50),
 position varchar(50),
 CONSTRAINT id_buyer_pk PRIMARY KEY(id_buyer));
--CREATE SEQUENCE buyer_id_seq START WITH 5 INCREMENT 1;
--DROP TABLE IF EXISTS buyer;
--DROP SEQUENCE IF EXISTS buyer_id_seq;

CREATE TABLE IF NOT EXISTS seller
(id_seller integer NOT NULL,
 login_seller varchar(20) NOT NULL,
 password_seller varchar(10) NOT NULL,
 number_passport_seller integer NOT NULL,
 full_name_seller varchar(100) NOT NULL,
 telephone_seller varchar(50),
 CONSTRAINT id_seller_pk PRIMARY KEY(id_seller),
 CONSTRAINT login_seller_uk UNIQUE (login_seller));
--CREATE SEQUENCE seller_id_seq START WITH 3 INCREMENT 1;
--DROP TABLE IF EXISTS seller;
--DROP SEQUENCE IF EXISTS seller_id_seq;

CREATE TABLE apartment
(id_apartment integer NOT NULL,
 street varchar(50) NOT NULL,
 house_number smallint NOT NULL,
 apartment_number smallint NOT NULL,
 type_of_house varchar(50),
 floor_apartment smallint,
 total_area numeric(5, 2),
 living_space numeric(5, 2),
 comfort_factor numeric(2, 1),
 CONSTRAINT id_apartment_pk PRIMARY KEY(id_apartment),
 CONSTRAINT house_number_uk UNIQUE (house_number, apartment_number, street));
--CREATE SEQUENCE apartment_id_seq START WITH 3 INCREMENT 1;
--DROP TABLE IF EXISTS apartment;
--DROP SEQUENCE IF EXISTS apartment_id_seq;

CREATE TABLE transactions
(id_transactions integer NOT NULL,
 id_buyer integer NOT NULL,
 id_seller integer NOT NULL,
 id_apartment integer NOT NULL,
 transaction_date date,
 sale_value integer NOT NULL CHECK (sale_value >= 0),
 CONSTRAINT id_transactions_pk PRIMARY KEY(id_transactions),
 CONSTRAINT id_buyer_fk FOREIGN KEY (id_buyer) REFERENCES buyer(id_buyer),
 CONSTRAINT id_seller_fk FOREIGN KEY (id_seller) REFERENCES seller(id_seller),
 CONSTRAINT id_apartment_fk FOREIGN KEY (id_apartment) REFERENCES apartment(id_apartment),
 CONSTRAINT id_buyer_uk UNIQUE (id_buyer, id_seller, id_apartment, transaction_date));
--CREATE SEQUENCE transactions_id_seq START WITH 3 INCREMENT 1;
--DROP TABLE IF EXISTS transactions;
--DROP SEQUENCE IF EXISTS transactions_id_seq;