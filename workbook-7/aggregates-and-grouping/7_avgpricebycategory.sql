SELECT CategoryID, AVG(UnitPrice)
FROM northwind.products
group by CategoryID
