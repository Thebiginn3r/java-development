SELECT ProductName, UnitPrice
FROM northwind.products
Where UnitPrice = (Select max(UnitPrice)
					From northwind.products);