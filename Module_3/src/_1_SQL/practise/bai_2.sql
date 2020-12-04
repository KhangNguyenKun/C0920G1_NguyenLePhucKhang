use practise_2;
create table payments(
customerNumber int, 
checkNumber int,
primary key (customerNumber , checkNumber),
paymentDate date,
amount int);
select customers.customerNumber, customerName, phone, paymentDate, amount from customers
inner join payments
on customers.customerNumber = payments.customerNumber
where city = 'Las Vegas';
select customers.customerNumber, customers.customerName, orders.orderNumber, orders.status
from customers
left join orders
on customers.customerNumber = orders.customerNumber;

select customers.customerNumber, customers.customerName, orders.orderNumber, orders.status
from customers LEFT JOIN orders
on customers.customerNumber = orders.customerNumber
where orderNumber is null
