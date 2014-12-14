create database hr;
create table employee (
         id INT ,
        name VARCHAR(20),
        dateofbirth DATE,
    	agency VARCHAR(20),
    	PRIMARY KEY (`id`)
     ) ;
create table agency (
         id INT ,
        name VARCHAR(30),
    	PRIMARY KEY (`id`)
     ) ;
     