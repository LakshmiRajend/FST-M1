REM   Script: Activtiy5
REM   Activity5

CREATE TABLE salesman( 
salesman_id int, 
salesman_name varchar2(20), 
salesman_city varchar2(20), 
commission int 
);

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

SELECT salesman_id, salesman_city  FROM salesman;

SELECT * from salesman WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

ALTER TABLE salesman 
ADD grade, INT;

UPDATE salesman SET grade=100;

SELECT * FROM salesman;

ALTER TABLE salesman ADD grade INT;

UPDATE salesman SET grade=100;

SELECT * FROM salesman;

