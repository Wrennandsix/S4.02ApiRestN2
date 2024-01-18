DROP DATABASE IF EXISTS bd_apirest_fruit;

create database bd_apirest_fruit;
use bd_apirest_fruit;

create table fruit(
id int not null primary key auto_increment,
`name` varchar(80) not null,
quantity_Kg int not null
);

insert into fruit(`name`, quantity_Kg) values 
("Pera","10");