-- question 7
SELECT ProductID, ProductName,UnitPrice, UnitsInStock
FROM northwind.products
where UnitsInStock = 0 and UnitsOnOrder > 0
-- group by UnitPrice
order by UnitPrice, ProductName;