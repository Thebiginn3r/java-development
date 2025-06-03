SELECT SupplierID, Count(*) as product_supplied
FROM northwind.products
group by SupplierID