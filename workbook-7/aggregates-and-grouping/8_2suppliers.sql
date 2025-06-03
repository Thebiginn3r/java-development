SELECT SupplierID, count(*)
FROM northwind.products
group by SupplierID
having count(*) >= 5
order by SupplierID