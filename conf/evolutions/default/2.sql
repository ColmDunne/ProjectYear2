# --- Sample dataset
 
# --- !Ups
 
delete from item_on_sale;
delete from category;
 
insert into category (id,name) values ( 1,'Trainers' );
insert into category (id,name) values ( 2,'Shorts' );
insert into category (id,name) values ( 3,'Bottoms' );
insert into category (id,name) values ( 4,'Leggings' );
insert into category (id,name) values ( 5,'Hoodies' );
insert into category (id,name) values ( 6,'Jackets' );


insert into item_on_sale (id,category_id,name,description,stock,price) values ( 1,1,'Television','Sony 42" LCD',1, 100.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 2,2,'Book','Mysteries of the Universe',1,3.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 3,3,'Fluffy Socks','Warm extra long socks (new)',100,2.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 4,4,'Tumbler Glass','Reject tumbler glasses (new)',40,1.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 5,5,'Piano','Grand, in need of tuning',1,99.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 6,4,'Chair','Comfortable armchair in good condition',1,50.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 7,1,'Washing Machine','1600rpm spin, A+++ rated, 10KG',2,300.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 8,4,'Water jug','Antique cristal, 2l',2,75.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 9,6,'Rowing machine','Great for keeping fit',1,50.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 10,6,'Junior tennis raquet','Never used',2,15.00 );