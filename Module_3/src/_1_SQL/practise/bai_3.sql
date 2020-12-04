create database practise_3;
use practise_3;
create table productlines (
productLine int primary key,
textDescription varchar(200) ,
htmlDescription varchar(200),
image varchar(1000) 
);
create table products (
productCode int primary key,
productName varchar(100) ,
productLine varchar(100) ,
productScale varchar(100) ,
productVender varchar(100) ,
productDescription varchar(100) ,
quantityInStock varchar(100) ,
buyPrice varchar(100) ,
MSRP varchar(100)
);
select productCode, productName, buyprice, quantityInStock from products
where buyprice > 56.76 and quantityInStock > 10 ;
SELECT productCode,productName, buyprice, textDescription
FROM products
INNER JOIN productlines
ON products.productline = productlines.productline
WHERE buyprice > 56.76 AND buyprice < 95.59;
