CREATE table contacts 
( contact_id int(11) NOT null auto_increment,
 last_name varchar(30) not null ,
 first_name varchar(30),
 birthday date,
 constraint contact_pk primary key(contact_id) );
 CREATE TABLE suppliers
( supplier_id INT(11) NOT NULL AUTO_INCREMENT,
  supplier_name VARCHAR(50) NOT NULL,
  account_rep VARCHAR(30) NOT NULL DEFAULT 'TBD',
  CONSTRAINT suppliers_pk PRIMARY KEY (supplier_id)
);
drop table suppliers;
alter table contacts 
add middle_name varchar(99) 
after last_name;
alter table contacts 
modify last_name varchar(98) null;
alter table contacts 
drop column birthday;
CREATE TABLE users(
   user_id INT AUTO_INCREMENT PRIMARY KEY,
   username VARCHAR(40),
   password VARCHAR(255),
   email VARCHAR(255)
);
CREATE TABLE roles(
   role_id INT AUTO_INCREMENT,
   role_name VARCHAR(50),
   PRIMARY KEY(role_id)
);
CREATE TABLE userroles(
   user_id INT NOT NULL,
   role_id INT NOT NULL,
   PRIMARY KEY(user_id,role_id),
   FOREIGN KEY(user_id) REFERENCES users(user_id),
   FOREIGN KEY(role_id) REFERENCES roles(role_id)
);
ALTER TABLE table_name
    ADD PRIMARY KEY(user_id);
    CREATE TABLE customers(
   id INT AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR(40),
   address VARCHAR(255),
   email VARCHAR(255)
);
    CREATE TABLE orders(
   id INT AUTO_INCREMENT,
   staff VARCHAR(50),
   PRIMARY KEY(id),
   customer_id INT FOREIGN KEY REFERENCES customers(id)
);