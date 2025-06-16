SELECT ProductID, ProductName, UnitPrice, CompanyName as SupplierName
FROM northwind.products
JOIN northwind.suppliers
ON products.SupplierID = suppliers.SupplierID
Where UnitPrice > 75