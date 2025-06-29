DROP TABLE IF EXISTS Accounts;
DROP TABLE IF EXISTS Employees;

CREATE TABLE Accounts (
    AccountID INTEGER PRIMARY KEY,
    CustomerName TEXT,
    Balance REAL,
    AccountType TEXT
);

CREATE TABLE Employees (
    EmpID INTEGER PRIMARY KEY,
    Name TEXT,
    Department TEXT,
    Salary REAL
);
INSERT INTO Accounts VALUES (101, 'Alice', 10000, 'Savings');
INSERT INTO Accounts VALUES (102, 'Bob', 7000, 'Current');
INSERT INTO Accounts VALUES (103, 'Charlie', 20000, 'Savings');

INSERT INTO Employees VALUES (1, 'David', 'Sales', 50000);
INSERT INTO Employees VALUES (2, 'Emma', 'IT', 60000);
INSERT INTO Employees VALUES (3, 'John', 'Sales', 55000);

UPDATE Accounts
SET Balance = Balance * 1.01
WHERE AccountType = 'Savings';
UPDATE Employees
SET Salary = Salary + (Salary * 0.10)
WHERE Department = 'Sales';

UPDATE Accounts
SET Balance = Balance - 5000
WHERE AccountID = 103 AND Balance >= 5000;

UPDATE Accounts
SET Balance = Balance + 5000
WHERE AccountID = 102;

SELECT * FROM Accounts;

SELECT * FROM Employees;
