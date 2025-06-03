-- question 5
SELECT ProductID, ProductName,UnitPrice, UnitsInStock
FROM northwind.products
where UnitsInStock >= 100
order by UnitPrice desc;