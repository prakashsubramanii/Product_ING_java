insert into product_group (id,product_group_name) values (1,'Sparen') ON DUPLICATE KEY UPDATE id=1;
insert into product_group (id,product_group_name) values (2,'Betalen') ON DUPLICATE KEY UPDATE id=2;
insert into product_group (id,product_group_name) values (3,'Hypotheek') ON DUPLICATE KEY UPDATE id=3;

insert into product (id,product_name,product_group_id,deposit_and_withdrawal,duration,interest_rate,max_investment,min_investment,percentage,special) 
values (1,'Oranjespaarrekening',1,'altijd mogelijk','onbepaald','variabel','geen','0','0.03','Doelsparen optie') ON DUPLICATE KEY UPDATE id=1;

insert into product (id,product_name,product_group_id,deposit_and_withdrawal,duration,interest_rate,max_investment,min_investment,percentage,special) 
values (2,'Groeigroterrekening',1,'altijd mogelijk','onbepaald','variabel','geen','0','0.20','Spaarleeuw cadeau') ON DUPLICATE KEY UPDATE id=2;

insert into product (id,product_name,product_group_id,deposit_and_withdrawal,duration,interest_rate,max_investment,min_investment,percentage,special) 
values (3,'Spaarrekening voor Unicef',1,'altijd mogelijk','onbepaald','variabel','geen','0','0.03','0,1% donatie aan Unicef') ON DUPLICATE KEY UPDATE id=3;

insert into product (id,product_name,product_group_id,deposit_and_withdrawal,duration,interest_rate,max_investment,min_investment,percentage,special) 
values (4,'Bonusrenterekening',1,'altijd mogelijk','onbepaald','variabel','geen','0','0.03','0,02% bonus na een jaar') ON DUPLICATE KEY UPDATE id=4;

insert into product (id,product_name,product_group_id,deposit_and_withdrawal,duration,interest_rate,max_investment,min_investment,percentage,special) 
values (5,'Spaardeposito',1,'eenmalige inleg','5 of 10 jaar','vast','geen','500','zie ING.nl','-') ON DUPLICATE KEY UPDATE id=5;

insert into product (id,product_name,product_group_id,deposit_and_withdrawal,duration,interest_rate,max_investment,min_investment,percentage,special) 
values (6,'Groen Spaardeposto',1,'eenmalige inleg','5 jaar ','vast','25000','5000','zie ING.nl','Belastingvoordeel') ON DUPLICATE KEY UPDATE id=6;

insert into product (id,product_name,product_group_id) values (7,'Bankspaarhypotheek',3) ON DUPLICATE KEY UPDATE id=7;
insert into product (id,product_name,product_group_id) values (8,'Aflossingsvrij',3) ON DUPLICATE KEY UPDATE id=8;
insert into product (id,product_name,product_group_id) values (9,'Annuiteit',3) ON DUPLICATE KEY UPDATE id=9;
insert into product (id,product_name,product_group_id) values (10,'Lineair',3) ON DUPLICATE KEY UPDATE id=10;

insert into product (id,product_name,product_group_id) values (11,'Betaalrekening',2) ON DUPLICATE KEY UPDATE id=11;
insert into product (id,product_name,product_group_id) values (12,'Betaalpas',2) ON DUPLICATE KEY UPDATE id=12;
insert into product (id,product_name,product_group_id) values (13,'Kwartaallimiet',2) ON DUPLICATE KEY UPDATE id=13;
insert into product (id,product_name,product_group_id) values (14,'Continu limiet',2) ON DUPLICATE KEY UPDATE id=14;



