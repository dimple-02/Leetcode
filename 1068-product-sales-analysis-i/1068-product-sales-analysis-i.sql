# Write your MySQL query statement below
Select product.product_name,sales.year,sales.price from sales Join product on product.product_id = sales.product_id 