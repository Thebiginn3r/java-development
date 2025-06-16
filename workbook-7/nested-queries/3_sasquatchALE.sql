SELECT OrderID, ProductID
FROM northwind.`order details`
where ProductID IN (Select ProductID
					From northwind.products
					Where ProductID = 34)