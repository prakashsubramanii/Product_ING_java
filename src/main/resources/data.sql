insert into product_group (id,product_group_name) values (1,"Sparen") ON DUPLICATE KEY UPDATE id=1;
insert into product_group (id,product_group_name) values (2,"Betalen") ON DUPLICATE KEY UPDATE id=2;
insert into product_group (id,product_group_name) values (3,"Hypotheek") ON DUPLICATE KEY UPDATE id=3;