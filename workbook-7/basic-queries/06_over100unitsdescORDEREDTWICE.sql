-- question 6
SELECT ProductID, ProductName,UnitPrice, UnitsInStock
FROM northwind.products
where UnitsInStock >= 100
-- group by UnitPrice
order by UnitPrice, ProductName;