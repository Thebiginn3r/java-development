SELECT OrderID, ShipName, ShipAddress
FROM northwind.orders
Where ShipVia IN (Select ShipperID
					From northwind.shippers
                    where ShipperID = 3)