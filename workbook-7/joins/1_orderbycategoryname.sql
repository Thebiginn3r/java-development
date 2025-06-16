SELECT ProductID, ProductName, UnitPrice, CategoryName
FROM northwind.products
JOIN northwind.categories
ON categories.CategoryID
order by CategoryName, ProductName

