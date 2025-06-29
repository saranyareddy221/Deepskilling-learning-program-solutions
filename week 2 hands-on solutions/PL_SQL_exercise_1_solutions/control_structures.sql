DROP TABLE IF EXISTS Loans;
DROP TABLE IF EXISTS Customers;
CREATE TABLE Customers (
    CustomerID INTEGER PRIMARY KEY,
    Name TEXT,
    Age INTEGER,
    Balance REAL,
    IsVIP TEXT
);

CREATE TABLE Loans (
    LoanID INTEGER PRIMARY KEY,
    CustomerID INTEGER,
    InterestRate REAL,
    DueDate TEXT,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

INSERT INTO Customers VALUES (1, 'Alice', 65, 12000, 'N');
INSERT INTO Customers VALUES (2, 'Bob', 45, 8000, 'N');
INSERT INTO Customers VALUES (3, 'Charlie', 70, 15000, 'N');

INSERT INTO Loans VALUES (101, 1, 8.0, '2025-07-10');
INSERT INTO Loans VALUES (102, 2, 7.5, '2025-08-01');
INSERT INTO Loans VALUES (103, 3, 9.0, '2025-07-24');

UPDATE Loans
SET InterestRate = InterestRate - 1
WHERE CustomerID IN (
    SELECT CustomerID FROM Customers WHERE Age > 60
);

UPDATE Customers
SET IsVIP = 'Y'
WHERE Balance > 10000;

SELECT c.Name, l.LoanID, l.DueDate
FROM Customers c
JOIN Loans l ON c.CustomerID = l.CustomerID
WHERE l.DueDate BETWEEN '2025-06-22' AND '2025-07-22';
